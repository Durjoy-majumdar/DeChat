package az0;

import a14.C53916l;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import gy3.C87412m;
import jp3.C46566c;
import jp3.C9486a;
import kotlin.Result;
import kotlin.ResultKt;
import ob0.C47350c;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C49335eu3;

/* renamed from: az0.a */
public final class C39661a implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C39663c<C101820nt3, C49335eu3> f106424a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<C49335eu3> f106425b;

    /* renamed from: c */
    public final /* synthetic */ C46566c<C9486a> f106426c;

    public C39661a(C39663c<C101820nt3, C49335eu3> cVar, C53916l<C49335eu3> lVar, C46566c<C9486a> cVar2) {
        this.f106424a = cVar;
        this.f106425b = lVar;
        this.f106426c = cVar2;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        C39663c<C101820nt3, C49335eu3> cVar2 = this.f106424a;
        cVar2.mo62234d("runCgi onTerminate, errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
        if (i2 == 0 && i == 0) {
            C53916l<C49335eu3> lVar = this.f106425b;
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type RESPONSE of com.tencent.mm.plugin.car_license_plate.cgi.CarLicensePlateCgiBase.send$lambda-2");
            lVar.resumeWith(Result.m168114constructorimpl((C49335eu3) aVar));
        } else {
            C53916l<C49335eu3> lVar2 = this.f106425b;
            Result.Companion companion = Result.Companion;
            lVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C39666f(i, i2, str, this.f106424a))));
        }
        this.f106426c.dead();
    }
}
