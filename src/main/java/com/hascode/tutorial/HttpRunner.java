package com.hascode.tutorial;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class HttpRunner {
	public static void main(final String[] args) throws Exception {
		int port = Integer.parseInt(args[0]);
		System.out.println("Starting embedded Jetty with port: " + port);
		Server server = new Server();
		ServerConnector c = new ServerConnector(server);
		c.setIdleTimeout(1000);
		c.setAcceptQueueSize(10);
		c.setPort(port);
		c.setHost("localhost");
		ServletContextHandler handler = new ServletContextHandler(server,
				"/app", true, false);
		ServletHolder servletHolder = new ServletHolder(DemoServlet.class);
		handler.addServlet(servletHolder, "/test");
		server.addConnector(c);
		server.start();
	}
}
