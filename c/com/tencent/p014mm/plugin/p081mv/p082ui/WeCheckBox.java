package com.tencent.p014mm.plugin.p081mv.p082ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.p081mv.p082ui.shake.C56968d;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.mv.ui.WeCheckBox */
public class WeCheckBox extends WeImageView {

    /* renamed from: r */
    public C56945b f163102r;

    /* renamed from: s */
    public boolean f163103s = false;

    /* renamed from: com.tencent.mm.plugin.mv.ui.WeCheckBox$a */
    public class C56944a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C56945b f163104d;

        public C56944a(C56945b bVar) {
            this.f163104d = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/WeCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WeCheckBox weCheckBox = WeCheckBox.this;
            boolean z = !weCheckBox.f163103s;
            weCheckBox.f163103s = z;
            C56945b bVar = this.f163104d;
            if (bVar != null) {
                ((C56968d) bVar).mo80419a(z);
            }
            WeCheckBox weCheckBox2 = WeCheckBox.this;
            if (weCheckBox2.f163103s) {
                weCheckBox2.setImageResource(C0966R.raw.icons_outlined_pause_white);
            } else {
                weCheckBox2.setImageResource(C0966R.raw.icons_outlined_playbtn_white);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/WeCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.WeCheckBox$b */
    public interface C56945b {
    }

    public WeCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setChecked(boolean z) {
        this.f163103s = z;
        C56945b bVar = this.f163102r;
        if (bVar != null) {
            ((C56968d) bVar).mo80419a(z);
        }
        if (z) {
            setImageResource(C0966R.raw.icons_outlined_pause_white);
        } else {
            setImageResource(C0966R.raw.icons_outlined_playbtn_white);
        }
    }

    public void setOnCheckedChangeListener(C56945b bVar) {
        this.f163102r = bVar;
        super.setOnClickListener(new C56944a(bVar));
    }

    public WeCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
