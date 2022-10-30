/*
 * Copyright 2019-2022 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/dev/LICENSE
 */

package net.mamoe.mirai.data

import net.mamoe.mirai.LowLevelApi

@LowLevelApi
public interface GuildMemberInfo {

    /**
     * 频道用户id
     */
    public val tinyId: Long

    public val title: String

    /**
     * 昵称
     */
    public val nickname: String

    /**
     * 上次发言时间 秒
     */
    public val lastSpeakTime: Long

    /**
     * 权限id
     */
    public val role: GuildChannelMemberPermissions

    /**
     * 成员权限等级 例：普通成员
     */
    public val roleName: String

}

public enum class GuildChannelMemberPermissions(
    private val display: Short,
) {
    /**
     * 可查看子频道 支持指定成员可见类型，支持身份组可见类型
     */
    VIEW((1 shl 0).toShort()),

    /**
     * 可管理子频道 创建者、管理员、子频道管理员都具有此权限
     */
    MANAGEMENT((1 shl 1).toShort()),

    /**
     * 可发言子频道 支持指定成员发言类型，支持身份组发言类型
     */
    SPEAK((1 shl 2).toShort()),

    /**
     * 可直播子频道 支持指定成员发起直播，支持身份组发起直播；仅可在直播子频道中设置
     */
    LIVE((1 shl 3).toShort()),

    /**
     * 只存在 Mirai 内部,不是从 OICQ 获得
     */
    NONE((-1).toShort())
    ;

    override fun toString(): String = "GuildChannelMemberPermissions: $display"
}