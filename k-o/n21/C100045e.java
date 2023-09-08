package n21;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import p21.C100616a;
import p21.C100621f;

/* renamed from: n21.e */
public class C100045e extends C100047f {

    /* renamed from: U */
    public View.OnClickListener f293073U = new C100046a();

    /* renamed from: n21.e$a */
    public class C100046a implements View.OnClickListener {
        public C100046a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorLocationItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100621f fVar = (C100621f) C100045e.this.f293078A;
            Intent intent = new Intent();
            intent.putExtra("map_view_type", 2);
            intent.putExtra("kwebmap_slat", fVar.f294815t);
            intent.putExtra("kwebmap_lng", fVar.f294816u);
            intent.putExtra("kPoiName", fVar.f294814s);
            intent.putExtra("Kwebmap_locaion", fVar.f294818w);
            double d = fVar.f294817v;
            if (d >= 0.0d) {
                intent.putExtra("kwebmap_scale", d);
            }
            intent.putExtra("kisUsername", "");
            intent.putExtra("kwebmap_from_to", true);
            intent.putExtra("KFavLocSigleView", true);
            intent.putExtra("kFavCanDel", false);
            intent.putExtra("kFavCanRemark", false);
            C88144b.m109791i(MMApplicationContext.getContext(), FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorLocationItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C100045e(View view, C93083b bVar) {
        super(view, bVar);
        this.f293082E.setVisibility(0);
        this.f293079B.setVisibility(8);
        this.f293087J.setVisibility(8);
        this.f293082E.setTag(this);
        this.f293082E.setOnClickListener(this.f293073U);
    }

    /* renamed from: y */
    public int mo139367y() {
        return 3;
    }

    /* renamed from: z */
    public void mo139368z(C100616a aVar, int i, int i2) {
        this.f293085H.setImageResource(C0966R.raw.app_attach_file_icon_location);
        C100621f fVar = (C100621f) aVar;
        this.f293083F.setText(fVar.f294814s);
        this.f293084G.setText(fVar.f294818w);
        super.mo139368z(aVar, i, i2);
    }
}
