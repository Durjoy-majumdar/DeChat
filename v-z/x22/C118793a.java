package x22;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.C116072d;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d62.C75339i;
import di3.C86312j;
import java.util.ArrayList;
import p196ln.C76705f;

/* renamed from: x22.a */
public class C118793a extends C116072d {

    /* renamed from: b */
    public ArrayList<String> f355422b = new ArrayList<>();

    /* renamed from: x22.a$a */
    public class C118794a {

        /* renamed from: a */
        public ImageView f355423a;

        /* renamed from: b */
        public TextView f355424b;

        public C118794a(C118793a aVar) {
        }
    }

    /* renamed from: a */
    public int mo177353a() {
        return this.f355422b.size();
    }

    /* renamed from: b */
    public View mo177354b(int i, View view, ViewGroup viewGroup) {
        C118794a aVar = new C118794a(this);
        if (view == null) {
            view = View.inflate(MMApplicationContext.getContext(), C0966R.C0971layout.f6531he, (ViewGroup) null);
            aVar.f355423a = (ImageView) view.findViewById(C0966R.C0970id.a25);
            aVar.f355424b = (TextView) view.findViewById(C0966R.C0970id.l2o);
            view.setTag(aVar);
        } else {
            aVar = (C118794a) view.getTag();
        }
        String str = this.f355422b.get(i);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar.f355423a, str);
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
        if (displayName.length() > 8) {
            displayName = displayName.subSequence(0, 9) + "...";
        }
        aVar.f355424b.setText(displayName);
        return view;
    }
}
