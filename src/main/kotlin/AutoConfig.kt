package org.laolittle.plugin.joinorquit

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

object AutoConfig : AutoSavePluginConfig("AutoConfig") {
    @ValueDescription("戳一戳的时间间隔(单位: 分)")
    val nudgeMin: Long by value(30L)

    @ValueDescription(
        """
        Bot 被戳时的回复
        可任意按照格式添加
        当戳一戳未触发反击时便随机选取列表中的消息发送
        """
    )
    val nudgedReply: Set<String> by value(
        setOf(
            "ヾ(≧へ≦)〃",
            "请不要戳我~>_<~",
            "别戳啦",
            "再戳我你就是笨批<( ￣^￣)",
            "吾身乃高性能机器人...呜呜"
        )
    )

    @ValueDescription("戳一戳触发反击的概率百分比(%)")
    val counterNudge: Int by value(30)

    @ValueDescription("戳一戳触发反击的回复消息")
    val counterNudgeMessage: String by value("戳回去(￣ ‘i ￣;)")

    @ValueDescription(
        """
        Bot 被禁言后对禁言操作者私聊的消息
        消息会按顺序放出
    """
    )
    val botMutedMessage: List<String> by value(
        listOf(
            "就是你禁言的我吧",
            "咕姆姆，我记住你了"
        )
    )

    @ValueDescription(
        """
        Bot 被管理员解禁时的回复
        参数: %主动% (解禁操作人)
        """
    )
    val botUnmuteMessage: String by value("我自由啦！感谢%主动% 大人 🥵🥵🥵🥵🥵🥵🥵🥵")

    @ValueDescription(
        """
        群员被禁言时的回复
        参数: %主动% (解禁操作人), %被动% (被解禁的成员)
        特殊: botOperatedMuteMessage 为 Bot 主动发起禁言时的回复
    """
    )
    val memberMutedMessage: String by value("%被动% 被%主动% 禁言了，好可惜")
    val botOperatedMuteMessage: String by value("%被动% 被本大人禁言了，好好反省吧！")

    @ValueDescription(
        """
        群员被解禁时的回复
        参数: %主动% (解禁操作人), %被动% (被解禁的成员)
        特殊: botOperatedUnmuteMessage 为 Bot 主动解除禁言时的回复
    """
    )
    val memberUnmuteMessage: String by value("%被动% 你自由啦！还不快感谢%主动% 大人")
    val botOperatedUnmuteMessage: String by value("%被动% 你自由啦！还不快感谢本大人")

    @ValueDescription(
        """
        全体解禁时的回复
        参数: %主动% (解禁操作人)
    """
    )
    val groupMuteAllRelease: String by value("嗯？好像能说话了耶")

    @ValueDescription(
        """
        有人被踢出群时的回复
        参数: %主动% (踢人操作人), %被动% (被踢出的前群员)
    """
    )
    val kickMessage: String by value("有个人被%主动% 踢了！好可怕")

    @ValueDescription(
        """
        有人主动退群时的回复
        参数: %主动% (退出的前群员)
    """
    )
    val quitMessage: String by value("有个人悄悄退群了...")
/*
    @ValueDescription("是否在禁言期间持续发送消息给操作人以及发送的消息")
    val keepSendMessageWhenMuted: Boolean by value(false)
    val initiativeMessage: Set<String> by value(setOf("快点给我解禁"))

 */
}