package gw2;

import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import cw2.C97399u;
import ew2.C97757a;
import ew2.C97758b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import kw2.C99263b;
import kw2.C99268i;
import sx3.C77813z;
import te3.bc4;
import te3.hc4;
import te3.ob4;
import te3.pc4;

/* renamed from: gw2.k */
public final class C98266k {

    /* renamed from: a */
    public final C99268i f288078a;

    /* renamed from: b */
    public final C98267l f288079b;

    /* renamed from: c */
    public final String f288080c;

    /* renamed from: d */
    public final long f288081d;

    /* renamed from: e */
    public final C98268m f288082e;

    /* renamed from: f */
    public final C98261f f288083f;

    /* renamed from: g */
    public String f288084g;

    public C98266k(C99268i iVar, pc4 pc4, C98267l lVar) {
        int i;
        int i2;
        int i3;
        C87412m.m108594g(iVar, "story");
        C87412m.m108594g(pc4, "storyTImeline");
        C87412m.m108594g(lVar, "storyItemScene");
        this.f288078a = iVar;
        this.f288079b = lVar;
        this.f288080c = "MicroMsg.StoryGalleryItem";
        long j = iVar.field_storyID;
        this.f288081d = j;
        int i4 = (int) iVar.systemRowid;
        int i5 = iVar.field_createTime;
        String str = iVar.field_userName;
        String str2 = "";
        C98268m mVar = new C98268m(i4, j, i5, str == null ? str2 : str);
        boolean z = false;
        if (pc4.f299136h.f299398e.size() > 0) {
            bc4 bc4 = pc4.f299136h.f299398e.get(0);
            C87412m.m108593f(bc4, "timeline.ContentObj.MediaObjList[0]");
            mVar.f288093f = bc4;
        }
        this.f288082e = mVar;
        this.f288083f = new C98261f();
        hc4 hc4 = new hc4();
        try {
            hc4.parseFrom(iVar.field_attrBuf);
        } catch (Exception unused) {
        }
        C98261f fVar = this.f288083f;
        String str3 = iVar.field_userName;
        str3 = str3 == null ? StoryCore.f281736t.mo134187e() : str3;
        fVar.getClass();
        fVar.f288068a = str3;
        C98261f fVar2 = this.f288083f;
        fVar2.f288069b = iVar.field_storyID;
        fVar2.f288070c = 0;
        iVar.mo138656o2();
        C99263b Lo = StoryCore.f281736t.mo134188f().mo138634Lo(iVar.field_storyID);
        boolean z2 = Lo == null || Lo.field_readCommentTime == 0;
        Iterator<ob4> it = hc4.f298341n.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            ob4 next = it.next();
            C87412m.m108593f(next, "commentDetail");
            C97757a aVar = new C97757a(next);
            if (Lo != null && (i3 = Lo.field_readCommentTime) > 0 && aVar.f286810c > i3 && !Util.isEqual(aVar.f286808a, StoryCore.f281736t.mo134187e())) {
                aVar.f286813f = true;
                z3 = true;
            }
            this.f288083f.f288074g.add(aVar);
            this.f288083f.f288075h.add(aVar);
            String str4 = this.f288083f.f288068a;
            C87412m.m108594g(str4, "<set-?>");
            aVar.f286818k = str4;
            iVar.mo138658q2();
        }
        Iterator<ob4> it4 = hc4.f298343p.iterator();
        boolean z4 = false;
        while (it4.hasNext()) {
            ob4 next2 = it4.next();
            C87412m.m108593f(next2, "bubleDetail");
            C97757a aVar2 = new C97757a(next2);
            if (Lo != null && (i2 = Lo.field_readCommentTime) > 0 && aVar2.f286810c > i2 && !Util.isEqual(aVar2.f286808a, StoryCore.f281736t.mo134187e())) {
                aVar2.f286813f = true;
                z4 = true;
            }
            this.f288083f.f288074g.add(aVar2);
            this.f288083f.f288076i.add(aVar2);
            String str5 = this.f288083f.f288068a;
            C87412m.m108594g(str5, "<set-?>");
            aVar2.f286818k = str5;
            iVar.mo138658q2();
        }
        Iterator<ob4> it5 = hc4.f298353z.iterator();
        boolean z5 = false;
        while (it5.hasNext()) {
            ob4 next3 = it5.next();
            C87412m.m108593f(next3, "visitorDetail");
            C97757a aVar3 = new C97757a(next3);
            if (Lo != null && (i = Lo.field_readCommentTime) > 0 && aVar3.f286810c > i && !Util.isEqual(aVar3.f286808a, StoryCore.f281736t.mo134187e())) {
                aVar3.f286813f = true;
                z5 = true;
            }
            this.f288083f.f288077j.add(aVar3);
            String str6 = this.f288083f.f288068a;
            C87412m.m108594g(str6, "<set-?>");
            aVar3.f286818k = str6;
            iVar.mo138658q2();
        }
        LinkedList<C97757a> linkedList = this.f288083f.f288074g;
        if (linkedList.size() > 1) {
            C77813z.m93909o(linkedList, new C98262g());
        }
        LinkedList<C97757a> linkedList2 = this.f288083f.f288075h;
        if (linkedList2.size() > 1) {
            C77813z.m93909o(linkedList2, new C98263h());
        }
        LinkedList<C97757a> linkedList3 = this.f288083f.f288076i;
        if (linkedList3.size() > 1) {
            C77813z.m93909o(linkedList3, new C98264i());
        }
        LinkedList<C97757a> linkedList4 = this.f288083f.f288077j;
        if (linkedList4.size() > 1) {
            C77813z.m93909o(linkedList4, new C98265j());
        }
        if (z2 && this.f288083f.f288074g.size() > 0) {
            C97758b bVar = C97758b.f286820d;
            long j2 = this.f288081d;
            C97757a aVar4 = this.f288083f.f288074g.get(0);
            C87412m.m108593f(aVar4, "comment.commentList[0]");
            C97757a aVar5 = aVar4;
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99263b Lo2 = hVar.mo134188f().mo138634Lo(j2);
            if (Lo2 == null) {
                Lo2 = new C99263b();
                Lo2.field_storyId = j2;
            }
            Lo2.field_readCommentId = aVar5.f286812e;
            Lo2.field_readCommentTime = aVar5.f286810c;
            hVar.mo134188f().update(Lo2, new String[0]);
        }
        C98261f fVar3 = this.f288083f;
        fVar3.f288071d = z4 || z3;
        fVar3.f288072e = z5;
        fVar3.f288073f = z3;
        String str7 = iVar.field_userName;
        this.f288084g = str7;
        C97399u uVar = C97399u.f285903a;
        if (!(C86013q1.m106450k(uVar.mo136670d(this.f288082e.f288093f, str7 != null ? str7 : str2)) || C86013q1.m106450k(uVar.mo136671e(this.f288082e.f288093f)))) {
            String str8 = this.f288082e.f288093f.f297958A;
            if (!((str8 == null || str8.length() == 0) ? true : z)) {
                return;
            }
        }
        String str9 = this.f288080c;
        Log.m105924i(str9, "LogStory: " + this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C98266k)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C98266k kVar = (C98266k) obj;
        return this.f288081d == kVar.f288081d && C87412m.m108589b(this.f288082e, kVar.f288082e) && C87412m.m108589b(this.f288083f, kVar.f288083f) && this.f288078a.mo138655n2().f131656e == kVar.f288078a.mo138655n2().f131656e;
    }

    public String toString() {
        return "StoryGalleryItem(videoItem=" + this.f288082e + ", comment=" + this.f288083f + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C98266k(C99268i iVar, pc4 pc4, C98267l lVar, int i, C8480h hVar) {
        this(iVar, pc4, (i & 4) != 0 ? C98267l.NORMAL : lVar);
    }
}
