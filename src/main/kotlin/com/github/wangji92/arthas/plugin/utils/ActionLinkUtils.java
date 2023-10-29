package com.github.wangji92.arthas.plugin.utils;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ui.components.AnActionLink;

/**
 * 构造 链接
 *
 * @author 汪小哥
 * @date 04-05-2021
 */
public class ActionLinkUtils {

    /**
     * 构造链接工具类
     *
     * @param linkUrl
     * @return
     */
    public static AnActionLink newActionLink(String linkUrl) {
        AnActionLink link = new AnActionLink("", new AnAction() {
            @Override
            public void actionPerformed(AnActionEvent anActionEvent) {
                BrowserUtil.browse(linkUrl);
            }
        });
        return link;
    }
}
