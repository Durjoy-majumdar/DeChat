package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.widget.AlbumChooserView */
public class AlbumChooserView extends LinearLayout {

    /* renamed from: d */
    public TextView f348674d;

    /* renamed from: e */
    public WeImageView f348675e;

    /* renamed from: f */
    public boolean f348676f = false;

    /* renamed from: g */
    public C116178b f348677g;

    /* renamed from: com.tencent.mm.ui.widget.AlbumChooserView$a */
    public class C116177a implements View.OnClickListener {
        public C116177a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/AlbumChooserView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C116178b bVar = AlbumChooserView.this.f348677g;
            if (bVar != null) {
                bVar.mo135191a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/AlbumChooserView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.AlbumChooserView$b */
    public interface C116178b {
        /* renamed from: a */
        void mo135191a();
    }

    public AlbumChooserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo177569a(context);
    }

    /* renamed from: a */
    public final void mo177569a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6369cy, this, true);
        this.f348674d = (TextView) inflate.findViewById(C0966R.C0970id.f5690ly);
        WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.f5689lx);
        this.f348675e = weImageView;
        weImageView.setRotation(90.0f);
        setOnClickListener(new C116177a());
    }

    public void setOnAlbumChooserViewClick(C116178b bVar) {
        this.f348677g = bVar;
    }

    public AlbumChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo177569a(context);
    }
}
