package uq1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import je1.C60816y4;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import te3.C64854ye0;
import u60.C65220d;
import u60.C65234n;
import up1.C65412c;
import up1.C65426w0;

/* renamed from: uq1.a */
public final class C65428a extends C65220d implements C11385n {

    /* renamed from: f */
    public final C65426w0 f188284f;

    /* renamed from: g */
    public C60816y4 f188285g;

    public C65428a(C65426w0 w0Var) {
        C87412m.m108594g(w0Var, "action");
        this.f188284f = w0Var;
    }

    /* renamed from: a */
    public void mo11852a() {
        C65426w0 w0Var = this.f188284f;
        C64854ye0 ye02 = w0Var.field_actionInfo;
        this.f188285g = new C60816y4(w0Var, ye02 != null ? ye02.f186503n : null);
        Class cls = FinderCommonFeatureService.class;
        long a = C31543z5.m39451a() - (this.f188284f.mo89532o2().createtime * ((long) 1000));
        C65426w0 w0Var2 = this.f188284f;
        long j = w0Var2.field_tryCount;
        if (j >= ((long) 2) || a >= ((long) 1200000)) {
            Log.m105924i("Finder.ActionTask", "make fail tryNext " + this.f188284f.mo89531n2() + " tryCount " + this.f188284f.field_tryCount + " createTime: " + this.f188284f.mo89532o2().createtime);
            this.f188284f.field_state = -1;
            C65412c Ex0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Ex0();
            C65426w0 w0Var3 = this.f188284f;
            Ex0.mo89494Yt(w0Var3.field_localCommentId, w0Var3, true);
            mo11853b(C65234n.OK);
            return;
        }
        w0Var2.field_tryCount = j + 1;
        Log.m105924i("Finder.ActionTask", "doAction " + this.f188284f + ' ' + this.f188284f + ".field_tryCount");
        C65412c Ex02 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Ex0();
        C65426w0 w0Var4 = this.f188284f;
        Ex02.mo89494Yt(w0Var4.field_localCommentId, w0Var4, false);
        C89137b0 d = C86709a0.m107524d();
        C60816y4 y4Var = this.f188285g;
        if (y4Var != null) {
            d.mo123460f(y4Var);
            C86709a0.m107524d().mo123455a(3906, this);
            return;
        }
        C87412m.m108603p("curScene");
        throw null;
    }

    /* renamed from: d */
    public String mo11854d() {
        C65426w0 w0Var = this.f188284f;
        StringBuilder sb = new StringBuilder();
        sb.append(w0Var.field_actionType);
        sb.append('_');
        sb.append(w0Var.field_feedId);
        sb.append('_');
        sb.append(w0Var.field_localCommentId);
        return sb.toString();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = FinderCommonFeatureService.class;
        C60816y4 y4Var = this.f188285g;
        Long l = null;
        if (y4Var == null) {
            C87412m.m108603p("curScene");
            throw null;
        } else if (C87412m.m108589b(yVar, y4Var)) {
            C86709a0.m107524d().mo123470p(3906, this);
            StringBuilder sb = new StringBuilder();
            sb.append("onSceneEnd ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(", ");
            sb.append(str);
            sb.append(", ");
            C65426w0 w0Var = this.f188284f;
            if (w0Var != null) {
                l = Long.valueOf(w0Var.field_localCommentId);
            }
            sb.append(l);
            Log.m105924i("Finder.ActionTask", sb.toString());
            C65426w0 w0Var2 = this.f188284f;
            if (w0Var2 == null) {
                return;
            }
            if (i == 0 && i2 == 0) {
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Ex0().mo89496qq(w0Var2.field_localCommentId);
                mo11853b(C65234n.OK);
                return;
            }
            if (!(i == 4 && (i2 == -5002 || i2 == -5001 || i2 == -4007 || i2 == -4006))) {
                if (i >= 4) {
                    w0Var2.field_state = -1;
                    if (i2 == -4010) {
                        w0Var2.field_failedFlag = 1;
                    }
                } else {
                    w0Var2.field_postTime = C31543z5.m39451a();
                }
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Ex0().mo89494Yt(w0Var2.field_localCommentId, w0Var2, false);
            } else {
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Ex0().mo89496qq(w0Var2.field_localCommentId);
            }
            mo11853b(C65234n.Fail);
        }
    }
}
