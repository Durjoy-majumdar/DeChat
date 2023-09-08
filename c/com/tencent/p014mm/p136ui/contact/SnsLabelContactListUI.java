package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
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
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.GetSnsObjectDetailEvent;
import com.tencent.p014mm.autogen.events.ReturnSnsObjectDetailEvent;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.storage.C44668u3;
import di3.C86312j;
import eb0.C45628s0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import jr2.C76440q;
import jr2.C99019x;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p196ln.C76705f;
import p214om.C11502f;
import p629ny.C76979h;
import te3.C51163rv3;

/* renamed from: com.tencent.mm.ui.contact.SnsLabelContactListUI */
public class SnsLabelContactListUI extends MMActivity {

    /* renamed from: d */
    public ListView f24475d;

    /* renamed from: e */
    public C6869c f24476e;

    /* renamed from: f */
    public ArrayList<String> f24477f = new ArrayList<>();

    /* renamed from: g */
    public int f24478g;

    /* renamed from: h */
    public String f24479h;

    /* renamed from: i */
    public SnsObject f24480i;

    /* renamed from: j */
    public ReturnSnsObjectDetailEventListener f24481j;

    /* renamed from: com.tencent.mm.ui.contact.SnsLabelContactListUI$ReturnSnsObjectDetailEventListener */
    public class ReturnSnsObjectDetailEventListener extends IListener<ReturnSnsObjectDetailEvent> {
        public ReturnSnsObjectDetailEventListener() {
            super(C40008f.f107254d);
            this.__eventId = -1656522510;
        }

        public boolean callback(IEvent iEvent) {
            ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent = (ReturnSnsObjectDetailEvent) iEvent;
            if (!(returnSnsObjectDetailEvent instanceof ReturnSnsObjectDetailEvent)) {
                return false;
            }
            SnsLabelContactListUI snsLabelContactListUI = SnsLabelContactListUI.this;
            SnsObject snsObject = returnSnsObjectDetailEvent.f9459d.f9460a;
            snsLabelContactListUI.f24480i = snsObject;
            if (snsObject != null) {
                snsLabelContactListUI.mo7868H7();
                SnsLabelContactListUI.this.initView();
            } else {
                snsLabelContactListUI.initView();
                SnsLabelContactListUI snsLabelContactListUI2 = SnsLabelContactListUI.this;
                C76879j.m92749t(snsLabelContactListUI2, snsLabelContactListUI2.getString(C0966R.string.jde), "", new C6878a4(this));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsLabelContactListUI$a */
    public class C6867a implements MenuItem.OnMenuItemClickListener {
        public C6867a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsLabelContactListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsLabelContactListUI$b */
    public class C6868b implements AdapterView.OnItemClickListener {
        public C6868b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/SnsLabelContactListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Intent intent = new Intent();
            C40294d dVar = (C40294d) SnsLabelContactListUI.this.f24476e.getItem(i);
            C76440q b = C99019x.m128970b();
            if (b == null) {
                SnsLabelContactListUI.this.finish();
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/SnsLabelContactListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            ((C5431p1.C5432a) b).mo6416g(intent, dVar.getUsername());
            intent.putExtra("Contact_User", dVar.getUsername());
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, SnsLabelContactListUI.this);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SnsLabelContactListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsLabelContactListUI$c */
    public static class C6869c extends BaseAdapter {

        /* renamed from: d */
        public Context f24485d = null;

        /* renamed from: e */
        public Map<Integer, C40294d> f24486e;

        /* renamed from: f */
        public C44668u3 f24487f;

        /* renamed from: g */
        public ColorStateList f24488g;

        /* renamed from: h */
        public ColorStateList f24489h;

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00ad=Splitter:B:35:0x00ad, B:28:0x009e=Splitter:B:28:0x009e} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C6869c(android.content.Context r10, java.util.List<java.lang.String> r11) {
            /*
                r9 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "MicroMsg.SnsLabelContactListUI"
                r9.<init>()
                r2 = 0
                r9.f24485d = r2
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                r9.f24486e = r3
                r9.f24487f = r2
                r9.f24485d = r10
                r3.clear()
                eb0.c r3 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.u3 r3 = r3.mo105907v()
                r9.f24487f = r3
                java.util.Iterator r11 = r11.iterator()
                r3 = 0
                r4 = 0
            L_0x0028:
                boolean r5 = r11.hasNext()
                if (r5 == 0) goto L_0x0055
                java.lang.Object r5 = r11.next()
                java.lang.String r5 = (java.lang.String) r5
                com.tencent.mm.storage.u3 r6 = r9.f24487f
                com.tencent.mm.storage.z1 r6 = r6.get(r5)
                if (r6 == 0) goto L_0x0028
                boolean r7 = r6.mo62927s3()
                if (r7 == 0) goto L_0x0028
                boolean r5 = eb0.C75592q0.m90764L(r5)
                if (r5 != 0) goto L_0x0028
                java.util.Map<java.lang.Integer, com.tencent.mm.contact.d> r5 = r9.f24486e
                int r7 = r4 + 1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5.put(r4, r6)
                r4 = r7
                goto L_0x0028
            L_0x0055:
                android.content.res.Resources r11 = r10.getResources()     // Catch:{ XmlPullParserException -> 0x00ab, IOException -> 0x009c, all -> 0x0099 }
                r4 = 2131101147(0x7f0605db, float:1.7814695E38)
                android.content.res.XmlResourceParser r11 = r11.getXml(r4)     // Catch:{ XmlPullParserException -> 0x00ab, IOException -> 0x009c, all -> 0x0099 }
                android.content.res.Resources r4 = r10.getResources()     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x008f, all -> 0x008a }
                r5 = 2131101148(0x7f0605dc, float:1.7814698E38)
                android.content.res.XmlResourceParser r2 = r4.getXml(r5)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x008f, all -> 0x008a }
                android.content.res.Resources r4 = r10.getResources()     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x008f, all -> 0x008a }
                android.content.res.ColorStateList r4 = android.content.res.ColorStateList.createFromXml(r4, r11)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x008f, all -> 0x008a }
                r9.f24488g = r4     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x008f, all -> 0x008a }
                android.content.res.Resources r10 = r10.getResources()     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x008f, all -> 0x008a }
                android.content.res.ColorStateList r10 = android.content.res.ColorStateList.createFromXml(r10, r2)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x008f, all -> 0x008a }
                r9.f24489h = r10     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x008f, all -> 0x008a }
                if (r11 == 0) goto L_0x0084
                r11.close()
            L_0x0084:
                if (r2 == 0) goto L_0x00bc
                r2.close()
                goto L_0x00bc
            L_0x008a:
                r10 = move-exception
                r8 = r2
                r2 = r11
                r11 = r8
                goto L_0x00be
            L_0x008f:
                r10 = move-exception
                r8 = r2
                r2 = r11
                r11 = r8
                goto L_0x009e
            L_0x0094:
                r10 = move-exception
                r8 = r2
                r2 = r11
                r11 = r8
                goto L_0x00ad
            L_0x0099:
                r10 = move-exception
                r11 = r2
                goto L_0x00be
            L_0x009c:
                r10 = move-exception
                r11 = r2
            L_0x009e:
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00bd }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r3)     // Catch:{ all -> 0x00bd }
                if (r2 == 0) goto L_0x00a8
                r2.close()
            L_0x00a8:
                if (r11 == 0) goto L_0x00bc
                goto L_0x00b9
            L_0x00ab:
                r10 = move-exception
                r11 = r2
            L_0x00ad:
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00bd }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r3)     // Catch:{ all -> 0x00bd }
                if (r2 == 0) goto L_0x00b7
                r2.close()
            L_0x00b7:
                if (r11 == 0) goto L_0x00bc
            L_0x00b9:
                r11.close()
            L_0x00bc:
                return
            L_0x00bd:
                r10 = move-exception
            L_0x00be:
                if (r2 == 0) goto L_0x00c3
                r2.close()
            L_0x00c3:
                if (r11 == 0) goto L_0x00c8
                r11.close()
            L_0x00c8:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.SnsLabelContactListUI.C6869c.<init>(android.content.Context, java.util.List):void");
        }

        public int getCount() {
            return ((HashMap) this.f24486e).size();
        }

        public Object getItem(int i) {
            if (i < 0) {
                return null;
            }
            return (C40294d) ((HashMap) this.f24486e).get(Integer.valueOf(i));
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6870d dVar;
            if (view == null) {
                view = View.inflate(this.f24485d, C0966R.C0971layout.f7078xk, (ViewGroup) null);
                dVar = new C6870d();
                dVar.f24491b = (TextView) view.findViewById(C0966R.C0970id.bqq);
                dVar.f24490a = (MaskLayout) view.findViewById(C0966R.C0970id.bqn);
                dVar.f24492c = (TextView) view.findViewById(C0966R.C0970id.bqu);
                dVar.f24493d = (TextView) view.findViewById(C0966R.C0970id.bql);
                view.setTag(dVar);
            } else {
                dVar = (C6870d) view.getTag();
            }
            getItem(i);
            C40294d dVar2 = (C40294d) getItem(i);
            dVar.f24491b.setVisibility(8);
            dVar.f24492c.setTextColor(!C45628s0.m50812z(dVar2.getUsername()) ? this.f24488g : this.f24489h);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW((ImageView) dVar.f24490a.getContentView(), dVar2.getUsername(), true);
            dVar.f24493d.setVisibility(8);
            dVar.f24490a.setVisibility(0);
            dVar.f24492c.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f24485d, dVar2.mo62898f(), dVar.f24492c.getTextSize()));
            dVar.f24492c.setVisibility(0);
            return view;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsLabelContactListUI$d */
    public static class C6870d {

        /* renamed from: a */
        public MaskLayout f24490a;

        /* renamed from: b */
        public TextView f24491b;

        /* renamed from: c */
        public TextView f24492c;

        /* renamed from: d */
        public TextView f24493d;
    }

    /* renamed from: H7 */
    public final void mo7868H7() {
        int i = this.f24480i.ExtFlag;
        if ((i & 1) != 0) {
            if ((i & 2) > 0) {
                this.f24479h = getString(C0966R.string.jdc);
                Iterator<C51163rv3> it = this.f24480i.BlackList.iterator();
                while (it.hasNext()) {
                    this.f24477f.add(it.next().f141175d);
                }
            } else if ((i & 4) > 0) {
                this.f24479h = getString(C0966R.string.jdd);
                Iterator<C51163rv3> it4 = this.f24480i.GroupUser.iterator();
                while (it4.hasNext()) {
                    this.f24477f.add(it4.next().f141175d);
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6362cr;
    }

    public void initView() {
        setMMTitle(this.f24479h);
        View findViewById = findViewById(C0966R.C0970id.g3q);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f24475d = (ListView) findViewById(C0966R.C0970id.f5610jr);
        ((TextView) findViewById(C0966R.C0970id.cil)).setVisibility(8);
        View findViewById2 = findViewById(C0966R.C0970id.f5628k9);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f24475d.setBackgroundColor(getResources().getColor(C0966R.color.al6));
        ((View) this.f24475d.getParent()).setBackgroundColor(getResources().getColor(C0966R.color.al6));
        setBackBtn(new C6867a());
        showOptionMenu(false);
        ArrayList<String> arrayList = this.f24477f;
        if (arrayList != null && arrayList.size() != 0) {
            C6869c cVar = new C6869c(this, this.f24477f);
            this.f24476e = cVar;
            this.f24475d.setAdapter(cVar);
            this.f24475d.setVisibility(0);
            this.f24475d.setOnItemClickListener(new C6868b());
        }
    }

    public void onCreate(Bundle bundle) {
        LinkedList<C51163rv3> linkedList;
        LinkedList<C51163rv3> linkedList2;
        super.onCreate(bundle);
        ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener = new ReturnSnsObjectDetailEventListener();
        this.f24481j = returnSnsObjectDetailEventListener;
        returnSnsObjectDetailEventListener.alive();
        int intExtra = getIntent().getIntExtra("sns_label_sns_info", -1);
        this.f24478g = intExtra;
        if (intExtra == -1) {
            finish();
            return;
        }
        GetSnsObjectDetailEvent getSnsObjectDetailEvent = new GetSnsObjectDetailEvent();
        getSnsObjectDetailEvent.f9304d.f9306a = this.f24478g;
        getSnsObjectDetailEvent.publish();
        SnsObject snsObject = getSnsObjectDetailEvent.f9305e.f9307a;
        this.f24480i = snsObject;
        if (snsObject != null) {
            if (snsObject.ExtFlag != 3 || (linkedList2 = snsObject.BlackList) == null || linkedList2.size() <= 0) {
                SnsObject snsObject2 = this.f24480i;
                if (snsObject2.ExtFlag != 5 || (linkedList = snsObject2.GroupUser) == null || linkedList.size() <= 0) {
                    return;
                }
            }
            mo7868H7();
            initView();
        }
    }

    public void onDestroy() {
        this.f24481j.dead();
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        C6869c cVar = this.f24476e;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }
}
