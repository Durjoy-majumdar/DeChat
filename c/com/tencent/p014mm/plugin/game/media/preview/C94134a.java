package com.tencent.p014mm.plugin.game.media.preview;

import com.tencent.p014mm.plugin.game.media.preview.GameVideoPreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;
import ly1.C99723d;
import vw1.C102299l;

/* renamed from: com.tencent.mm.plugin.game.media.preview.a */
public class C94134a implements C99723d.C99725b {

    /* renamed from: a */
    public final /* synthetic */ GameVideoPreviewUI f271874a;

    public C94134a(GameVideoPreviewUI gameVideoPreviewUI) {
        this.f271874a = gameVideoPreviewUI;
    }

    /* renamed from: a */
    public void mo129209a(LinkedList<C102299l> linkedList, boolean z) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(Util.isNullOrNil((List) linkedList) ? 0 : linkedList.size());
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.Haowan.GameVideoPreviewUI", "data size:%d, hasNext:%b", objArr);
        if (!this.f271874a.isFinishing() && !this.f271874a.isDestroyed()) {
            if (!Util.isNullOrNil((List) linkedList)) {
                GameVideoPreviewUI.C94126h hVar = this.f271874a.f271822f;
                hVar.getClass();
                if (!Util.isNullOrNil((List) linkedList)) {
                    hVar.f271844d.addAll(linkedList);
                    MMHandlerThread.postToMainThreadDelayed(new C94135b(hVar), 1000);
                }
            }
            this.f271874a.f271833t = z;
        }
    }
}
