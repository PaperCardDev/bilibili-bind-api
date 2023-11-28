package cn.paper_card.bilibili_bind.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface BindService {
    // 添加绑定
    void addBind(@NotNull BindInfo info) throws Exception;

    // 删除绑定
    boolean removeBind(@NotNull UUID uuid, long uid) throws Exception;

    @Nullable BindInfo queryByUuid(@NotNull UUID uuid) throws Exception;

    @Nullable BindInfo queryByUid(long uid) throws Exception;
}
