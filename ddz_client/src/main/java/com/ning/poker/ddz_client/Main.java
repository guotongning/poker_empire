package com.ning.poker.ddz_client;

import com.beust.jcommander.JCommander;
import com.ning.poker.ddz_client.command.Command;

import java.util.Scanner;

/**
 * 测试类
 *
 * @author 郭桐宁
 * @date 2023-04-01
 */
public class Main {

    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Command command = new Command();
            String[] params = scanner.nextLine().split(" ");
            JCommander.newBuilder().addObject(command).build().parse(params);
            System.out.println(command);
        }
    }
}
