package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86016v1;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.c0 */
public final class C30703c0 implements C86016v1 {

    /* renamed from: a */
    public static final C30703c0 f82611a = new C30703c0();

    public final boolean accept(C86009m1 m1Var, String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_FILENAME);
        return !C112551y.m153819s(str, ".", false);
    }
}
