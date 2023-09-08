package com.tencent.p014mm.p136ui.chatting.component;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryChatTopBarEntranceExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDoubleTapHeadViewStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPreviewReportStruct;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.chatting.view.AvatarImageView;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jw2.C99069d;
import lc3.C10485b;
import p270xi.C91212b;
import zj3.C79371n;

@C91212b(exportInterface = C73666z2.class)
/* renamed from: com.tencent.mm.ui.chatting.component.z4 */
public class C73668z4 extends C73412a implements C73666z2 {

    /* renamed from: e */
    public List<String> f216296e = Collections.synchronizedList(new ArrayList());

    /* renamed from: f */
    public List<String> f216297f = Collections.synchronizedList(new ArrayList());

    /* renamed from: g */
    public boolean f216298g = true;

    /* renamed from: h */
    public SparseArray<WeakReference<AvatarImageView>> f216299h = new SparseArray<>();

    /* renamed from: F4 */
    public void mo26186F4() {
        long j;
        int i = 1;
        Log.m105925i("MicroMsg.StoryStateComponent", "onChattingResume: hashCode:%s", Integer.valueOf(hashCode()));
        StoryDoubleTapHeadViewStruct storyDoubleTapHeadViewStruct = C99069d.f290428k;
        storyDoubleTapHeadViewStruct.f194466d = storyDoubleTapHeadViewStruct.mo86045b("SourceUserName", this.f215752d.mo91577r(), true);
        StoryDoubleTapHeadViewStruct storyDoubleTapHeadViewStruct2 = C99069d.f290428k;
        if (this.f216298g) {
            j = 2;
        } else {
            String r = this.f215752d.mo91577r();
            C87412m.m108594g(r, "userName");
            if (TextUtils.isEmpty(r)) {
                i = 0;
            } else if (!C87412m.m108589b(StoryCore.f281736t.mo134187e(), r)) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(r);
                i = z1Var.mo62934u3() ? 3 : z1Var.mo62927s3() ? 4 : 5;
            }
            j = (long) i;
        }
        storyDoubleTapHeadViewStruct2.f194467e = j;
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        Log.m105925i("MicroMsg.StoryStateComponent", "onChattingPause: hashCode:%s", Integer.valueOf(hashCode()));
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Log.m105925i("MicroMsg.StoryStateComponent", "onChattingEnterAnimStart: user %s hashCode:%s", this.f215752d.mo91577r(), Integer.valueOf(hashCode()));
        this.f215752d.f193286j.removeOptionMenu(3);
        this.f216296e.clear();
        this.f216297f.clear();
        ((C79371n) this.f215752d.f193278b.mo102812a(C79371n.class)).mo102410u3(0);
        String r = this.f215752d.mo91577r();
        if (!Util.isNullOrNil(r)) {
            this.f216298g = C72996z1.m85820U5(r);
        }
        StoryChatTopBarEntranceExposeStruct storyChatTopBarEntranceExposeStruct = C99069d.f290427j;
        storyChatTopBarEntranceExposeStruct.f194463d = storyChatTopBarEntranceExposeStruct.mo86045b("UserName", this.f215752d.mo91577r(), true);
        StoryChatTopBarEntranceExposeStruct storyChatTopBarEntranceExposeStruct2 = C99069d.f290427j;
        boolean z = this.f216298g;
        storyChatTopBarEntranceExposeStruct2.f194464e = z ? 4 : 5;
        storyChatTopBarEntranceExposeStruct2.f194465f = 0;
        if (z) {
            this.f215752d.f193292p = C74928u.m89762a(String.valueOf(4));
        } else {
            this.f215752d.f193292p = C74928u.m89762a(String.valueOf(5));
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        Log.m105925i("MicroMsg.StoryStateComponent", "onChattingEnterAnimEnd: hashCode:%s", Integer.valueOf(hashCode()));
    }

    /* renamed from: i */
    public void mo102704i() {
        Log.m105925i("MicroMsg.StoryStateComponent", "updateMenuItem enable %s", Integer.valueOf(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("StoryShouldShowEntraceInChatRoom", 1)));
        this.f215752d.f193286j.removeOptionMenu(3);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        Log.m105925i("MicroMsg.StoryStateComponent", "onComponentUnInstall: hashCode:%s", Integer.valueOf(hashCode()));
        this.f216296e.clear();
        this.f216299h.clear();
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        Log.m105925i("MicroMsg.StoryStateComponent", "onChattingExitAnimStart: hashCode:%s", Integer.valueOf(hashCode()));
        this.f216296e.clear();
        this.f216299h.clear();
        StoryPreviewReportStruct storyPreviewReportStruct = C99069d.f290421d;
        storyPreviewReportStruct.f266267g = storyPreviewReportStruct.mo86045b("SourceUserName", "", false);
        StoryPreviewReportStruct storyPreviewReportStruct2 = C99069d.f290421d;
        storyPreviewReportStruct2.f266266f = 0;
        storyPreviewReportStruct2.f266268h = 0;
        StoryDoubleTapHeadViewStruct storyDoubleTapHeadViewStruct = C99069d.f290428k;
        storyDoubleTapHeadViewStruct.f194466d = storyDoubleTapHeadViewStruct.mo86045b("SourceUserName", "", true);
        C99069d.f290428k.f194467e = 0;
    }
}
