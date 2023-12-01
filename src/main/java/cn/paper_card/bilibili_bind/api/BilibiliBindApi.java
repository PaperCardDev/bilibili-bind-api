package cn.paper_card.bilibili_bind.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface BilibiliBindApi {

    @NotNull BindService getBindService();

    @NotNull BindCodeService getBindCodeService();

    @NotNull PreLoginResponse handlePreLogin(@NotNull UUID uuid, @NotNull String name);

    @Nullable String onMainGroupMessage(@NotNull String message, long senderQq);
}
