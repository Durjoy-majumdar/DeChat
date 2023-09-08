package mq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import nq1.C61890e;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import qq1.C63317a;
import sq1.C64147b;
import sq1.C64149d;
import u60.C65220d;
import u60.C65234n;

/* renamed from: mq1.d */
public final class C61556d extends C65220d implements C11385n {

    /* renamed from: f */
    public final C64147b f174959f;

    /* renamed from: g */
    public final C63317a f174960g;

    /* renamed from: h */
    public C61890e f174961h;

    public C61556d(C64147b bVar, C63317a aVar) {
        C87412m.m108594g(bVar, "action");
        this.f174959f = bVar;
        this.f174960g = aVar;
    }

    /* renamed from: a */
    public void mo11852a() {
        C63317a aVar = this.f174960g;
        if (aVar != null) {
            this.f174961h = new C61890e(this.f174959f, aVar);
            long a = C31543z5.m39451a() - (this.f174959f.mo88876n2().createtime * ((long) 1000));
            C64147b bVar = this.f174959f;
            long j = bVar.field_tryCount;
            if (j >= ((long) 2) || a >= ((long) 1200000)) {
                Log.m105924i("MicroMsg.MusicUni.ActionTask", "make fail tryNext " + this.f174959f.mo88875m2() + " tryCount " + this.f174959f.field_tryCount + " createTime: " + this.f174959f.mo88876n2().createtime);
                this.f174959f.field_state = -1;
                C64149d a2 = C64149d.f181862f.mo88889a();
                C64147b bVar2 = this.f174959f;
                a2.mo88888qq(bVar2.field_localCommentId, bVar2, true);
                mo11853b(C65234n.OK);
                return;
            }
            bVar.field_tryCount = j + 1;
            Log.m105924i("MicroMsg.MusicUni.ActionTask", "doAction " + this.f174959f + ' ' + this.f174959f + ".field_tryCount");
            C64149d a3 = C64149d.f181862f.mo88889a();
            C64147b bVar3 = this.f174959f;
            a3.mo88888qq(bVar3.field_localCommentId, bVar3, false);
            C89137b0 d = C86709a0.m107524d();
            C61890e eVar = this.f174961h;
            if (eVar != null) {
                d.mo123460f(eVar);
                C86709a0.m107524d().mo123455a(6964, this);
                return;
            }
            C87412m.m108603p("curScene");
            throw null;
        }
    }

    /* renamed from: d */
    public String mo11854d() {
        C64147b bVar = this.f174959f;
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.field_actionType);
        sb.append('_');
        sb.append(bVar.field_feedId);
        sb.append('_');
        sb.append(bVar.field_localCommentId);
        return sb.toString();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C61890e eVar = this.f174961h;
        Long l = null;
        if (eVar == null) {
            C87412m.m108603p("curScene");
            throw null;
        } else if (C87412m.m108589b(yVar, eVar)) {
            C86709a0.m107524d().mo123470p(6964, this);
            StringBuilder sb = new StringBuilder();
            sb.append("onSceneEnd ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(", ");
            sb.append(str);
            sb.append(", ");
            C64147b bVar = this.f174959f;
            if (bVar != null) {
                l = Long.valueOf(bVar.field_localCommentId);
            }
            sb.append(l);
            Log.m105924i("MicroMsg.MusicUni.ActionTask", sb.toString());
            C64147b bVar2 = this.f174959f;
            if (bVar2 == null) {
                return;
            }
            if (i == 0 && i2 == 0) {
                C64149d.f181862f.mo88889a().mo88886Lo(bVar2.field_localCommentId);
                mo11853b(C65234n.OK);
                return;
            }
            if (!(i == 4 && (i2 == -5002 || i2 == -5001 || i2 == -4007 || i2 == -4006))) {
                if (i >= 4) {
                    bVar2.field_state = -1;
                    if (i2 == -4010) {
                        bVar2.field_failedFlag = 1;
                    }
                } else {
                    bVar2.field_postTime = C31543z5.m39451a();
                }
                C64149d.f181862f.mo88889a().mo88888qq(bVar2.field_localCommentId, bVar2, false);
            } else {
                C64149d.f181862f.mo88889a().mo88886Lo(bVar2.field_localCommentId);
            }
            mo11853b(C65234n.Fail);
        }
    }
}
