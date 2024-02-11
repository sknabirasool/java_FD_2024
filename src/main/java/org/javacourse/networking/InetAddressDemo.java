package org.javacourse;

import java.net.InetAddress;

public class InetAddressDemo {

    public static void main(String[] args) {

        try {
            InetAddress address= InetAddress.getByName("www.fastlane.com");
            System.out.println("IP Address "+address.getHostAddress());
            System.out.println("Host Name "+address.getHostName());
            System.out.println(""+address.getAddress());

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        }
}
