package com.ning.poker.ddz_client.command;

import com.beust.jcommander.Parameter;

/**
 * 登录命令定义
 *
 * @author 郭桐宁
 * @date 2023-04-01
 */
public class Command {
    @Parameter(names = {"--length", "-l"})
    private int length;
    @Parameter(names = {"--pattern", "-p"})
    private int pattern;

    @Override
    public String toString() {
        return "Command{" +
                "length=" + length +
                ", pattern=" + pattern +
                '}';
    }
}
