package gl3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import gl3.C75922b;
import p629ny.C76979h;

/* renamed from: gl3.r */
public class C75957r extends C75922b {

    /* renamed from: x */
    public String f222731x;

    /* renamed from: y */
    public C75959b f222732y = new C75959b();

    /* renamed from: z */
    public C75958a f222733z = new C75958a(this);

    /* renamed from: gl3.r$a */
    public class C75958a implements C75922b.C75923a {

        /* renamed from: a */
        public TextView f222734a;

        public C75958a(C75957r rVar) {
        }
    }

    /* renamed from: gl3.r$b */
    public class C75959b implements C75922b.C75924b {
        public C75959b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            String str = ((C75957r) bVar).f222731x;
            TextView textView = ((C75958a) aVar).f222734a;
            if (textView != null) {
                if (str == null || str.length() == 0) {
                    textView.setVisibility(8);
                    return;
                }
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(textView.getContext(), str, textView.getTextSize()));
                textView.setVisibility(0);
            }
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bwh, viewGroup, false);
            C75958a aVar = C75957r.this.f222733z;
            aVar.f222734a = (TextView) inflate.findViewById(C0966R.C0970id.evf);
            inflate.setTag(aVar);
            if (C75957r.this.f222606c) {
                View findViewById = inflate.findViewById(C0966R.C0970id.evg);
                if (findViewById != null) {
                    findViewById.setBackgroundResource(C0966R.color.f2947a4);
                }
                TextView textView = aVar.f222734a;
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            }
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    public C75957r(int i) {
        super(0, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f222732y;
    }
}
