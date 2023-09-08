package p858ng;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C11184p0;
import p1083jg.C98939a;
import p434ig.C98672d;
import p606mm.C99933h;
import p855lg.C61278a;
import ph0.C100792a;
import qh0.C62619a;
import rx3.C13598b0;
import th0.C101888l;

/* renamed from: ng.i */
public final class C61701i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C61704k f175398d;

    /* renamed from: e */
    public final /* synthetic */ C61278a f175399e;

    /* renamed from: ng.i$a */
    public static final class C61702a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C61702a f175400d = new C61702a();

        public C61702a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    public C61701i(C61704k kVar, C61278a aVar) {
        this.f175398d = kVar;
        this.f175399e = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C72963f4 f4Var;
        Class<C62619a> cls = C62619a.class;
        Class cls2 = C99933h.class;
        ArrayList arrayList = new ArrayList();
        C61278a aVar = this.f175399e;
        if (aVar != null) {
            arrayList.add(aVar.f174389h);
        }
        ArrayList arrayList2 = new ArrayList();
        C61278a aVar2 = this.f175399e;
        if (!(aVar2 == null || (f4Var = aVar2.f174390i) == null)) {
            arrayList2.add(f4Var);
        }
        int itemId = menuItem.getItemId();
        C98672d dVar = null;
        if (itemId == 0) {
            C101888l lVar = C101888l.f300029a;
            AppCompatActivity activity = this.f175398d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            lVar.mo141365o((MMActivity) activity, arrayList, arrayList2, C61702a.f175400d);
            C61278a aVar3 = this.f175399e;
            C72963f4 f4Var2 = aVar3 != null ? aVar3.f174390i : null;
            int size = lVar.mo141354c(aVar3 != null ? aVar3.f174388g : null).size();
            C61278a aVar4 = this.f175399e;
            int size2 = lVar.mo141355d(aVar4 != null ? aVar4.f174388g : null).size();
            C61278a aVar5 = this.f175399e;
            int i2 = aVar5 != null ? aVar5.f174386e : 0;
            if (aVar5 != null) {
                dVar = aVar5.f174389h;
            }
            ((C99933h) C86312j.m106911c(cls2)).mo84406lr(18, "album_enter_from_scene", cls, new C98939a(16, f4Var2, size, size2, dVar, i2));
        } else if (itemId == 2) {
            C101888l lVar2 = C101888l.f300029a;
            AppCompatActivity activity2 = this.f175398d.getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            lVar2.mo141353b((MMActivity) activity2, arrayList, arrayList2);
            C61278a aVar6 = this.f175399e;
            C72963f4 f4Var3 = aVar6 != null ? aVar6.f174390i : null;
            int size3 = lVar2.mo141354c(aVar6 != null ? aVar6.f174388g : null).size();
            C61278a aVar7 = this.f175399e;
            int size4 = lVar2.mo141355d(aVar7 != null ? aVar7.f174388g : null).size();
            C61278a aVar8 = this.f175399e;
            int i3 = aVar8 != null ? aVar8.f174386e : 0;
            if (aVar8 != null) {
                dVar = aVar8.f174389h;
            }
            ((C99933h) C86312j.m106911c(cls2)).mo84406lr(18, "album_enter_from_scene", cls, new C98939a(18, f4Var3, size3, size4, dVar, i3));
        } else if (itemId == 5) {
            AppCompatActivity activity3 = this.f175398d.getActivity();
            C61278a aVar9 = this.f175399e;
            C98672d dVar2 = aVar9 != null ? aVar9.f174389h : null;
            String d = C100792a.f295260a.mo140233d(dVar2, aVar9 != null ? aVar9.f174390i : null);
            if (Util.isNullOrNil(d)) {
                Log.m105928w("MicroMsg.AlbumUtil", "share image to timeline fail, filePath is null");
                return;
            }
            Intent intent = new Intent();
            StringBuilder sb = new StringBuilder();
            sb.append("album_");
            sb.append(C75592q0.m90789s());
            sb.append('_');
            sb.append(dVar2 != null ? dVar2.mo55264K() : null);
            String sb4 = sb.toString();
            String a = C86493v0.m107223a(sb4);
            C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", sb4);
            intent.putExtra("reportSessionId", a);
            intent.putExtra("Ksnsupload_type", 0);
            intent.putExtra("sns_kemdia_path", d);
            C88144b.m109791i(activity3, "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
        }
    }
}
