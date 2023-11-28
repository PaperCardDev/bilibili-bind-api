package cn.paper_card.bilibili_bind.api;

import java.util.UUID;

public record BindCodeInfo(
        int code,
        UUID uuid,
        String name,
        long time
) {
}
