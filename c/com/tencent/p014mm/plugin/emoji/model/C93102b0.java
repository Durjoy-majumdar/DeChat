package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import java.util.LinkedList;
import java.util.List;
import t61.C101728d;

/* renamed from: com.tencent.mm.plugin.emoji.model.b0 */
public interface C93102b0 {
    /* renamed from: a */
    void mo127604a();

    /* renamed from: b */
    LinkedList<EmojiGroupInfo> mo127605b();

    List<C101728d> getDataList();

    void onMove(int i, int i2);

    void reset();
}
