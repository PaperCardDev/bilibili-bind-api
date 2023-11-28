package cn.paper_card.bilibili_bind.api;

import java.util.UUID;

public record BindInfo(
        UUID uuid,
        String name,
        long uid,
        String remark,
        long time
) {
}