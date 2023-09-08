package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jr2.C76440q;
import jr2.C9511t;
import jr2.C99019x;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import org.xmlpull.v1.XmlPullParserException;
import os2.C11766m0;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.ui.contact.SnsTagContactListUI */
public class SnsTagContactListUI extends MMActivity {

    /* renamed from: d */
    public ListView f24494d;

    /* renamed from: e */
    public C6873c f24495e;

    /* renamed from: f */
    public List<Long> f24496f = new ArrayList();

    /* renamed from: com.tencent.mm.ui.contact.SnsTagContactListUI$a */
    public class C6871a implements AdapterView.OnItemClickListener {
        public C6871a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SnsTagContactListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Intent intent = new Intent();
            C40294d dVar = (C40294d) SnsTagContactListUI.this.f24495e.getItem(i);
            C76440q b = C99019x.m128970b();
            if (b == null) {
                SnsTagContactListUI.this.finish();
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/SnsTagContactListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            ((C5431p1.C5432a) b).mo6416g(intent, dVar.getUsername());
            intent.putExtra("sns_adapter_type", 1);
            C88144b.m109791i(SnsTagContactListUI.this.getContext(), "sns", ".ui.SnsTimeLineUserPagerUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SnsTagContactListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsTagContactListUI$b */
    public class C6872b implements MenuItem.OnMenuItemClickListener {
        public C6872b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsTagContactListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsTagContactListUI$c */
    public static class C6873c extends BaseAdapter {

        /* renamed from: d */
        public Context f24499d = null;

        /* renamed from: e */
        public Map<Integer, C40294d> f24500e = new HashMap();

        /* renamed from: f */
        public Map<Integer, String> f24501f = new HashMap();

        /* renamed from: g */
        public C44668u3 f24502g = null;

        /* renamed from: h */
        public ColorStateList f24503h;

        /* renamed from: i */
        public ColorStateList f24504i;

        public C6873c(Context context, List<Long> list) {
            this.f24499d = context;
            this.f24500e.clear();
            this.f24501f.clear();
            this.f24502g = C97625j3.m125812b().mo105907v();
            int i = 0;
            for (Long longValue : list) {
                long longValue2 = longValue.longValue();
                C9511t f = C99019x.m128974f();
                if (f != null) {
                    C11766m0 m0Var = (C11766m0) f;
                    for (String username : m0Var.mo11651Ow(longValue2)) {
                        C40294d dVar = new C40294d();
                        dVar.setUsername(username);
                        Map<Integer, String> map = this.f24501f;
                        Integer valueOf = Integer.valueOf(this.f24500e.size());
                        SnsMethodCalculate.markStartTimeMs("getTagName", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
                        String str = m0Var.mo11657qq(longValue2).field_tagName;
                        SnsMethodCalculate.markEndTimeMs("getTagName", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
                        map.put(valueOf, str);
                        this.f24500e.put(Integer.valueOf(i), dVar);
                        i++;
                    }
                }
            }
            try {
                XmlResourceParser xml = context.getResources().getXml(C0966R.color.a4r);
                XmlResourceParser xml2 = context.getResources().getXml(C0966R.color.a4s);
                this.f24503h = ColorStateList.createFromXml(context.getResources(), xml);
                this.f24504i = ColorStateList.createFromXml(context.getResources(), xml2);
            } catch (XmlPullParserException e) {
                Log.printErrStackTrace("MicroMsg.SnsTagContactList", e, "", new Object[0]);
            } catch (IOException e2) {
                Log.printErrStackTrace("MicroMsg.SnsTagContactList", e2, "", new Object[0]);
            }
        }

        /* renamed from: a */
        public final String mo7877a(int i) {
            if (!((HashMap) this.f24501f).containsKey(Integer.valueOf(i))) {
                return "";
            }
            return (String) ((HashMap) this.f24501f).get(Integer.valueOf(i));
        }

        public int getCount() {
            return ((HashMap) this.f24500e).size();
        }

        public Object getItem(int i) {
            C72996z1 z1Var;
            if (i < 0) {
                return null;
            }
            C40294d dVar = (C40294d) ((HashMap) this.f24500e).get(Integer.valueOf(i));
            if (dVar.mo62845A2() != 0 || (z1Var = this.f24502g.get(dVar.getUsername())) == null) {
                return dVar;
            }
            ((HashMap) this.f24500e).put(Integer.valueOf(i), z1Var);
            return z1Var;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6874d dVar;
            if (view == null) {
                view = View.inflate(this.f24499d, C0966R.C0971layout.f7078xk, (ViewGroup) null);
                dVar = new C6874d();
                dVar.f24506b = (TextView) view.findViewById(C0966R.C0970id.bqq);
                dVar.f24505a = (MaskLayout) view.findViewById(C0966R.C0970id.bqn);
                dVar.f24507c = (TextView) view.findViewById(C0966R.C0970id.bqu);
                dVar.f24508d = (TextView) view.findViewById(C0966R.C0970id.bql);
                view.setTag(dVar);
            } else {
                dVar = (C6874d) view.getTag();
            }
            int i2 = i - 1;
            String a = ((C40294d) getItem(i2)) == null ? "" : mo7877a(i2);
            C40294d dVar2 = (C40294d) getItem(i);
            if (i == 0) {
                dVar.f24506b.setVisibility(0);
                dVar.f24506b.setText(mo7877a(i));
                dVar.f24506b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else if (i <= 0 || mo7877a(i).equals(a)) {
                dVar.f24506b.setVisibility(8);
            } else {
                dVar.f24506b.setVisibility(0);
                dVar.f24506b.setText(mo7877a(i));
                dVar.f24506b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            dVar.f24507c.setTextColor(!C45628s0.m50812z(dVar2.getUsername()) ? this.f24503h : this.f24504i);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW((ImageView) dVar.f24505a.getContentView(), dVar2.getUsername(), true);
            dVar.f24508d.setVisibility(8);
            dVar.f24505a.setVisibility(0);
            dVar.f24507c.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f24499d, dVar2.mo62898f(), dVar.f24507c.getTextSize()));
            dVar.f24507c.setVisibility(0);
            return view;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsTagContactListUI$d */
    public static class C6874d {

        /* renamed from: a */
        public MaskLayout f24505a;

        /* renamed from: b */
        public TextView f24506b;

        /* renamed from: c */
        public TextView f24507c;

        /* renamed from: d */
        public TextView f24508d;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6362cr;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.jij);
        View findViewById = findViewById(C0966R.C0970id.g3q);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/ui/contact/SnsTagContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/ui/contact/SnsTagContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f24494d = (ListView) findViewById(C0966R.C0970id.f5610jr);
        long[] longArrayExtra = getIntent().getLongArrayExtra("sns_tag_list");
        if (longArrayExtra == null) {
            finish();
            return;
        }
        for (long valueOf : longArrayExtra) {
            ((ArrayList) this.f24496f).add(Long.valueOf(valueOf));
        }
        ((TextView) findViewById(C0966R.C0970id.cil)).setVisibility(8);
        View findViewById2 = findViewById(C0966R.C0970id.f5628k9);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/ui/contact/SnsTagContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/ui/contact/SnsTagContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f24494d.setBackgroundColor(getResources().getColor(C0966R.color.al6));
        ((View) this.f24494d.getParent()).setBackgroundColor(getResources().getColor(C0966R.color.al6));
        C6873c cVar = new C6873c(this, this.f24496f);
        this.f24495e = cVar;
        this.f24494d.setAdapter(cVar);
        this.f24494d.setVisibility(0);
        this.f24494d.setOnItemClickListener(new C6871a());
        setBackBtn(new C6872b());
        showOptionMenu(false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        C6873c cVar = this.f24495e;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }
}
