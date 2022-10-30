/*
 * Copyright 2019-2022 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/dev/LICENSE
 */

package net.mamoe.mirai.internal.contact.info

import kotlinx.serialization.Serializable
import net.mamoe.mirai.data.GuildChannelMemberPermissions
import net.mamoe.mirai.data.GuildMemberInfo
import net.mamoe.mirai.internal.network.Packet

@Serializable
internal data class GuildMemberInfoImpl(
    override val tinyId: Long,
    override val title: String,
    override val nickname: String,
    override val lastSpeakTime: Long,
    override val role: GuildChannelMemberPermissions,
    override val roleName: String
) : GuildMemberInfo, Packet, Packet.NoLog {

}