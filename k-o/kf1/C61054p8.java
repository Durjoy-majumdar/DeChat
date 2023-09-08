package kf1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C56660w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87413o;
import ht1.C60151b;
import ht1.C60166f;
import java.util.List;
import nj3.C76875f0;
import od3.C62001a;
import rx3.C13598b0;
import wr1.C66184f;

/* renamed from: kf1.p8 */
public final class C61054p8 extends C87413o implements C32226l<C60166f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f173881d;

    /* renamed from: e */
    public final /* synthetic */ String f173882e;

    /* renamed from: f */
    public final /* synthetic */ FinderItem f173883f;

    /* renamed from: g */
    public final /* synthetic */ C76875f0 f173884g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<List<String>, C13598b0> f173885h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61054p8(AppCompatActivity appCompatActivity, String str, FinderItem finderItem, C76875f0 f0Var, C32226l<? super List<String>, C13598b0> lVar) {
        super(1);
        this.f173881d = appCompatActivity;
        this.f173882e = str;
        this.f173883f = finderItem;
        this.f173884g = f0Var;
        this.f173885h = lVar;
    }

    public Object invoke(Object obj) {
        C60166f fVar = (C60166f) obj;
        if (fVar != null) {
            AppCompatActivity appCompatActivity = this.f173881d;
            String str = this.f173882e;
            FinderItem finderItem = this.f173883f;
            C76875f0 f0Var = this.f173884g;
            C32226l<List<String>, C13598b0> lVar = this.f173885h;
            AppCompatActivity appCompatActivity2 = appCompatActivity;
            C60166f fVar2 = fVar;
            C56660w0 w0Var = new C56660w0(appCompatActivity2, str, 18, fVar2, (C60151b) null, 16, (C8480h) null);
            w0Var.mo80010a(finderItem.getId(), new C61050o8(appCompatActivity2, f0Var, finderItem, fVar2, lVar, w0Var));
            C66184f.C66185a aVar = w0Var.f162415c;
            if (aVar != null) {
                aVar.f190207c.show();
            }
            C62001a.f176265a.mo86878a(w0Var.f162413a);
        } else {
            Log.m105924i("MircoMsg.FinderRecentForwardUtils", "can not share!");
        }
        return C13598b0.f38549a;
    }
}
