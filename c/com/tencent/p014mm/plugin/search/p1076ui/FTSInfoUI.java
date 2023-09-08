package com.tencent.p014mm.plugin.search.p1076ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import i21.C98591h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kv1.C61173o;
import kv1.C99252h;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import nj3.C76879j;
import p03.C21912d;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.search.ui.FTSInfoUI */
public class FTSInfoUI extends MMActivity implements C61173o {

    /* renamed from: d */
    public Button f273360d;

    /* renamed from: e */
    public Button f273361e;

    /* renamed from: f */
    public Button f273362f;

    /* renamed from: g */
    public Button f273363g;

    /* renamed from: h */
    public TextView f273364h;

    /* renamed from: i */
    public C89779i0 f273365i;

    /* renamed from: j */
    public View.OnClickListener f273366j = new C94538c();

    /* renamed from: com.tencent.mm.plugin.search.ui.FTSInfoUI$a */
    public class C94535a implements MenuItem.OnMenuItemClickListener {
        public C94535a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FTSInfoUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.search.ui.FTSInfoUI$b */
    public class C94536b implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.search.ui.FTSInfoUI$b$a */
        public class C94537a implements DialogInterface.OnCancelListener {
            public C94537a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                FTSInfoUI.this.finish();
            }
        }

        public C94536b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/search/ui/FTSInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSInfoUI fTSInfoUI = FTSInfoUI.this;
            if (fTSInfoUI.f273365i == null) {
                fTSInfoUI.f273365i = C76879j.m92723Q(fTSInfoUI, "", fTSInfoUI.getString(C0966R.string.gas), true, true, new C94537a());
            }
            FTSInfoUI.this.f273365i.show();
            C76728k kVar = new C76728k();
            kVar.f224467b = 65526;
            kVar.f224478m = FTSInfoUI.this;
            ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(10000, kVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/search/ui/FTSInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.search.ui.FTSInfoUI$c */
    public class C94538c implements View.OnClickListener {
        public C94538c() {
        }

        public void onClick(View view) {
            List<Pair<String, String>> list;
            Class cls = C98591h.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/search/ui/FTSInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int intValue = ((Integer) view.getTag()).intValue();
            if (intValue == 1) {
                list = ((C98591h) C86312j.m106911c(cls)).mo137970Rf(FTSInfoUI.m119542H7());
            } else if (intValue == 2) {
                list = ((C98591h) C86312j.m106911c(cls)).mo137977wH(FTSInfoUI.m119542H7());
            } else if (intValue == 3) {
                list = ((C98591h) C86312j.m106911c(cls)).mo137969Iq(FTSInfoUI.m119542H7());
            } else {
                C117292a.m165361g(this, "com/tencent/mm/plugin/search/ui/FTSInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (Pair next : list) {
                stringBuffer.append("[");
                stringBuffer.append(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName((String) next.first));
                stringBuffer.append("]\n");
                stringBuffer.append((String) next.second);
                stringBuffer.append("\n");
            }
            FTSInfoUI.this.f273364h.setText(stringBuffer.toString());
            C117292a.m165361g(this, "com/tencent/mm/plugin/search/ui/FTSInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static long m119542H7() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        C89779i0 i0Var = this.f273365i;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("[DBSize]=");
        C99252h.C99253a aVar = C99252h.f291029b;
        sb.append(Util.getSizeMB(aVar.f291033a * 1048576));
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        stringBuffer.append("[WXContact]=" + aVar.f291034b);
        stringBuffer.append("\n");
        stringBuffer.append("[WXChatroom]=" + aVar.f291035c);
        stringBuffer.append("\n");
        stringBuffer.append("[Favorite]=" + aVar.f291037e);
        stringBuffer.append("\n");
        stringBuffer.append("[Message]=" + aVar.f291036d);
        stringBuffer.append("\n");
        stringBuffer.append("[WebSearchH5Version]=" + C43471q.m46977a(0));
        stringBuffer.append("\n");
        stringBuffer.append("[TopStoryH5Version]=" + C43471q.m46977a(1));
        stringBuffer.append("\n");
        stringBuffer.append("[WxAppH5Version]=" + C43471q.m46977a(3));
        stringBuffer.append("\n");
        stringBuffer.append("[BoxH5Version]=" + C43471q.m46977a(2));
        stringBuffer.append("\n");
        stringBuffer.append("[TopStoryWebViewCore]=" + ((C21912d) C86312j.m106911c(C21912d.class)).mo34965kw());
        stringBuffer.append("\n");
        stringBuffer.append("[PardusH5Version]=" + C43471q.m46977a(5));
        stringBuffer.append("\n");
        this.f273364h.setText(stringBuffer.toString());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.at8;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f3g);
        setBackBtn(new C94535a());
        this.f273360d = (Button) findViewById(C0966R.C0970id.f6i);
        this.f273364h = (TextView) findViewById(C0966R.C0970id.f358456f71);
        this.f273360d.setOnClickListener(new C94536b());
        this.f273361e = (Button) findViewById(C0966R.C0970id.i2o);
        this.f273362f = (Button) findViewById(C0966R.C0970id.i2q);
        this.f273363g = (Button) findViewById(C0966R.C0970id.i2p);
        this.f273361e.setTag(1);
        this.f273362f.setTag(2);
        this.f273363g.setTag(3);
        this.f273361e.setOnClickListener(this.f273366j);
        this.f273362f.setOnClickListener(this.f273366j);
        this.f273363g.setOnClickListener(this.f273366j);
    }
}
