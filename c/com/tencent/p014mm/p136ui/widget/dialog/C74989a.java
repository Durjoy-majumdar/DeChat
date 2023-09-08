package com.tencent.p014mm.p136ui.widget.dialog;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.widget.dialog.a */
public class C74989a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMFilterDialog.C74986g.C74988b f220593d;

    /* renamed from: e */
    public final /* synthetic */ MMFilterDialog.C74986g f220594e;

    public C74989a(MMFilterDialog.C74986g gVar, MMFilterDialog.C74986g.C74988b bVar) {
        this.f220594e = gVar;
        this.f220593d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$RecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ImageView imageView = this.f220594e.f220583e;
        if (imageView != null) {
            imageView.setVisibility(8);
            MMFilterDialog.C74986g gVar = this.f220594e;
            ((MMFilterDialog.C74986g.C74987a) ((ArrayList) gVar.f220582d).get(gVar.f220584f)).f220589c = false;
        }
        MMFilterDialog.C74986g gVar2 = this.f220594e;
        TextView textView = gVar2.f220585g;
        if (textView != null) {
            textView.setText(((MMFilterDialog.C74986g.C74987a) ((ArrayList) gVar2.f220582d).get(this.f220593d.mo17365l())).f220587a);
        }
        AdapterView.OnItemClickListener onItemClickListener = this.f220594e.f220586h;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick((AdapterView) null, view, this.f220593d.mo17365l(), (long) this.f220593d.mo17365l());
        }
        this.f220593d.f220591B.setVisibility(0);
        ((MMFilterDialog.C74986g.C74987a) ((ArrayList) this.f220594e.f220582d).get(this.f220593d.mo17365l())).f220589c = true;
        this.f220594e.f220583e = this.f220593d.f220591B;
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$RecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
