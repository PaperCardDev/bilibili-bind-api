package cn.paper_card.bilibili_bind.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface BindCodeService {
    int createCode(@NotNull UUID uuid, @NotNull String name) throws Exception;

    @Nullable BindCodeInfo takeByCode(int code) throws Exception;

    @Nullable BindCodeInfo takeByUuid(@NotNull UUID uuid) throws Exception;

    int cleanOutdated() throws Exception;
}
