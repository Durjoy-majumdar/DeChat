package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import gx0.C45970k;
import gx0.C45973l;
import hc0.C20937c;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import ob0.C11385n;
import p629ny.C76979h;
import rb0.C47969h;
import rb0.C48009v0;
import te3.C49480fw1;
import te3.C50254lf;
import te3.ey4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI */
public class EnterpriseBizEntranceListUI extends MMActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f109134j = 0;

    /* renamed from: d */
    public C40632f f109135d;

    /* renamed from: e */
    public ListView f109136e;

    /* renamed from: f */
    public String f109137f;

    /* renamed from: g */
    public AdapterView.OnItemClickListener f109138g;

    /* renamed from: h */
    public C45973l f109139h;

    /* renamed from: i */
    public C40630e f109140i = new C40630e(new C40629d());

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$a */
    public class C40626a implements AdapterView.OnItemClickListener {
        public C40626a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Log.m105925i("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "onItemClick position = %s", Integer.valueOf(i));
            EnterpriseBizEntranceListUI enterpriseBizEntranceListUI = EnterpriseBizEntranceListUI.this;
            C40636h hVar = enterpriseBizEntranceListUI.f109135d.f109147e.get(i);
            if (hVar == null) {
                Log.m105920e("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "item is null.");
            } else {
                enterpriseBizEntranceListUI.f109140i.mo63524a(hVar.f109154a);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$b */
    public class C40627b implements MenuItem.OnMenuItemClickListener {
        public C40627b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EnterpriseBizEntranceListUI.this.hideVKB();
            EnterpriseBizEntranceListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$c */
    public class C40628c implements View.OnClickListener {
        public C40628c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = EnterpriseBizEntranceListUI.this.f109136e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$3", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$3", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$d */
    public class C40629d implements C40630e.C40631a {
        public C40629d() {
        }

        /* renamed from: a */
        public String mo63506a() {
            return EnterpriseBizEntranceListUI.this.f109137f;
        }

        public Context getContext() {
            return EnterpriseBizEntranceListUI.this;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$e */
    public static class C40630e {

        /* renamed from: a */
        public C40631a f109145a;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$e$a */
        public interface C40631a {
            /* renamed from: a */
            String mo63506a();

            Context getContext();
        }

        public C40630e(C40631a aVar) {
            this.f109145a = aVar;
        }

        /* renamed from: a */
        public void mo63524a(ey4 ey4) {
            int i = ey4.f133174d;
            if (i == 1) {
                try {
                    Intent intent = new Intent();
                    intent.setClassName(this.f109145a.getContext(), "com.tencent.mm.ui.conversation.EnterpriseConversationUI");
                    intent.putExtra("enterprise_biz_name", this.f109145a.mo63506a());
                    intent.putExtra("enterprise_biz_display_name", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f109145a.mo63506a()));
                    Context context = this.f109145a.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$BizEntranceListItemBinding", "jumpToMsgListUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$BizEntranceListItemBinding", "jumpToMsgListUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Throwable th) {
                    Log.m105929w("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "jumpToMsgListUI fail, father=%s, error msg: %s", this.f109145a.mo63506a(), th.getMessage());
                }
            } else if (i == 2) {
                Intent intent2 = new Intent();
                intent2.putExtra("enterprise_from_scene", 1);
                intent2.putExtra("enterprise_biz_name", this.f109145a.mo63506a());
                C88144b.m109791i(this.f109145a.getContext(), "brandservice", ".ui.EnterpriseBizContactListUI", intent2, (Bundle) null);
            } else if (i == 3) {
                String str = ey4.f133177g;
                Intent intent3 = new Intent();
                intent3.putExtra("rawUrl", str);
                intent3.putExtra("useJs", true);
                intent3.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                intent3.addFlags(67108864);
                C88144b.m109791i(this.f109145a.getContext(), "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$g */
    public static class C40634g implements C11385n {

        /* renamed from: d */
        public final WeakReference<EnterpriseBizEntranceListUI> f109151d;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$g$a */
        public class C40635a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ EnterpriseBizEntranceListUI f109152d;

            /* renamed from: e */
            public final /* synthetic */ C49480fw1 f109153e;

            public C40635a(C40634g gVar, EnterpriseBizEntranceListUI enterpriseBizEntranceListUI, C49480fw1 fw12) {
                this.f109152d = enterpriseBizEntranceListUI;
                this.f109153e = fw12;
            }

            public void run() {
                try {
                    EnterpriseBizEntranceListUI enterpriseBizEntranceListUI = this.f109152d;
                    LinkedList<ey4> linkedList = this.f109153e.f133716e.f136740u;
                    int i = EnterpriseBizEntranceListUI.f109134j;
                    enterpriseBizEntranceListUI.mo63520H7(linkedList);
                    this.f109152d.f109135d.notifyDataSetChanged();
                } catch (Throwable unused) {
                }
            }
        }

        public C40634g(EnterpriseBizEntranceListUI enterpriseBizEntranceListUI) {
            this.f109151d = new WeakReference<>(enterpriseBizEntranceListUI);
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r1, int r2, java.lang.String r3, ob0.C117747y r4) {
            /*
                r0 = this;
                java.lang.ref.WeakReference<com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI> r1 = r0.f109151d     // Catch:{  }
                java.lang.Object r1 = r1.get()     // Catch:{  }
                if (r1 == 0) goto L_0x0031
                java.lang.ref.WeakReference<com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI> r1 = r0.f109151d     // Catch:{  }
                java.lang.Object r1 = r1.get()     // Catch:{  }
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizEntranceListUI) r1     // Catch:{  }
                boolean r2 = r1.isFinishing()     // Catch:{  }
                if (r2 == 0) goto L_0x0017
                return
            L_0x0017:
                com.tencent.mm.network.u r2 = r4.getReqResp()     // Catch:{  }
                ob0.c r2 = (ob0.C47350c) r2     // Catch:{  }
                ob0.c$d r2 = r2.f127056b     // Catch:{  }
                pe3.a r2 = r2.f127083a     // Catch:{  }
                te3.fw1 r2 = (te3.C49480fw1) r2     // Catch:{  }
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$g$a r3 = new com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$g$a     // Catch:{  }
                r3.<init>(r0, r1, r2)     // Catch:{  }
                int r1 = com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizEntranceListUI.f109134j     // Catch:{  }
                zt3.t r1 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0031 }
                zt3.j r1 = (zt3.C119157j) r1     // Catch:{ all -> 0x0031 }
                r1.mo183895z(r3)     // Catch:{ all -> 0x0031 }
            L_0x0031:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizEntranceListUI.C40634g.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: H7 */
    public final void mo63520H7(List<ey4> list) {
        if (this.f109135d != null) {
            if (list == null || list.isEmpty()) {
                C40632f fVar = this.f109135d;
                fVar.getClass();
                LinkedList<C40636h> linkedList = new LinkedList<>();
                C40636h hVar = new C40636h();
                hVar.f109155b = C0966R.raw.enterprise_chat_entry_avatar;
                ey4 ey4 = hVar.f109154a;
                ey4.f133174d = 1;
                ey4.f133175e = fVar.f109146d.getString(C0966R.string.cau);
                ey4 ey42 = hVar.f109154a;
                ey42.f133176f = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fms) + "/node/wework/images/icon_im.48490d44c5.png";
                linkedList.add(hVar);
                C40636h hVar2 = new C40636h();
                hVar2.f109154a.f133175e = fVar.f109146d.getString(C0966R.string.cbc);
                ey4 ey43 = hVar2.f109154a;
                ey43.f133176f = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fms) + "/node/wework/images/icon_workspace.cb133ed72e.png";
                hVar2.f109154a.f133174d = 2;
                linkedList.add(hVar2);
                fVar.f109147e = linkedList;
                return;
            }
            C40632f fVar2 = this.f109135d;
            fVar2.getClass();
            LinkedList<C40636h> linkedList2 = new LinkedList<>();
            for (ey4 hVar3 : list) {
                linkedList2.add(new C40636h(hVar3));
            }
            fVar2.f109147e = linkedList2;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a3l;
    }

    public void initView() {
        LinkedList<ey4> linkedList;
        this.f109136e = (ListView) findViewById(C0966R.C0970id.ckf);
        if (this.f109135d == null) {
            this.f109135d = new C40632f(this);
            try {
                C47969h jo = C48009v0.Ex0().mo72749jo(this.f109137f);
                C50254lf lfVar = new C50254lf();
                lfVar.parseFrom(jo.field_raw_attrs);
                linkedList = lfVar.f137368d;
            } catch (Throwable unused) {
                linkedList = null;
            }
            mo63520H7(linkedList);
            C48009v0.Ex0().mo72745SE(this.f109137f, new C40634g(this));
            this.f109138g = new C40626a();
        }
        Log.m105925i("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "count = %s", Integer.valueOf(this.f109135d.getCount()));
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f109137f);
        setMMTitle(z1Var.mo62909j3());
        if (!z1Var.mo62927s3() || this.f109135d.getCount() <= 0) {
            this.f109136e.setVisibility(8);
            TextView textView = (TextView) findViewById(C0966R.C0970id.ckg);
            textView.setText(C0966R.string.cb8);
            textView.setVisibility(0);
        } else {
            this.f109136e.setVisibility(0);
            this.f109136e.setAdapter(this.f109135d);
            this.f109136e.setOnItemClickListener(this.f109138g);
        }
        setBackBtn(new C40627b());
        setToTop(new C40628c());
        C45973l lVar = this.f109139h;
        lVar.getClass();
        addIconOptionMenu(1, (int) C0966R.string.f7374ee, (int) C0966R.raw.actionbar_icon_dark_add, (MenuItem.OnMenuItemClickListener) new C45970k(lVar));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f109139h.mo71367a(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getIntExtra("enterprise_scene", 2);
        String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
        this.f109137f = stringExtra;
        this.f109139h = new C45973l(this, stringExtra);
        Log.m105925i("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "bizName = %s", stringExtra);
        initView();
        C48009v0.Fx0().add(this.f109135d);
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this.f109135d);
    }

    public void onDestroy() {
        C48009v0.Fx0().remove(this.f109135d);
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this.f109135d);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (!C45628s0.m50740E(this.f109137f)) {
            Log.m105921e("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "%s !isContact", this.f109137f);
            finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$f */
    public class C40632f extends BaseAdapter implements MStorage.IOnStorageChange, MStorageEx.IOnStorageChange {

        /* renamed from: d */
        public final Context f109146d;

        /* renamed from: e */
        public LinkedList<C40636h> f109147e;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$f$a */
        public class C40633a {

            /* renamed from: a */
            public ImageView f109149a;

            /* renamed from: b */
            public TextView f109150b;

            public C40633a(C40632f fVar) {
            }

            /* renamed from: a */
            public void mo63529a() {
                ImageView imageView = this.f109149a;
                if (imageView != null) {
                    imageView.setImageDrawable((Drawable) null);
                    this.f109149a.setVisibility(8);
                }
                TextView textView = this.f109150b;
                if (textView != null) {
                    textView.setText("");
                    this.f109150b.setVisibility(8);
                }
            }
        }

        public C40632f(Context context) {
            this.f109146d = context;
        }

        public int getCount() {
            return this.f109147e.size();
        }

        public Object getItem(int i) {
            return this.f109147e.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C40633a aVar;
            View view2;
            Context context = viewGroup.getContext();
            if (view == null) {
                aVar = new C40633a(this);
                view2 = View.inflate(context, C0966R.C0971layout.a3j, (ViewGroup) null);
                aVar.f109149a = (ImageView) view2.findViewById(C0966R.C0970id.h_u);
                aVar.f109150b = (TextView) view2.findViewById(C0966R.C0970id.f358830ha0);
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C40633a) view.getTag();
            }
            C40636h hVar = this.f109147e.get(i);
            if (hVar == null) {
                aVar.mo63529a();
                return view2;
            }
            aVar.mo63529a();
            int paddingBottom = view2.getPaddingBottom();
            int paddingTop = view2.getPaddingTop();
            int paddingRight = view2.getPaddingRight();
            int paddingLeft = view2.getPaddingLeft();
            view2.setBackgroundDrawable(C76577a.m92158i(context, C0966R.C0969drawable.f4855pa));
            view2.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            aVar.f109150b.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(context, Util.nullAsNil(hVar.f109154a.f133175e), aVar.f109150b.getTextSize()));
            aVar.f109150b.setVisibility(0);
            aVar.f109149a.setVisibility(0);
            C20828a b = C20828a.m22825b();
            String str = hVar.f109154a.f133176f;
            ImageView imageView = aVar.f109149a;
            int i2 = hVar.f109155b;
            if (i2 == 0) {
                i2 = C0966R.raw.default_avatar;
            }
            b.mo32519h(str, imageView, C40636h.m43871a(context, i2));
            return view2;
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            Log.m105925i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange1 %d", Integer.valueOf(i));
            MMHandlerThread.postToMainThread(new C40667i(this));
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105925i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange2 %s", str);
            MMHandlerThread.postToMainThread(new C40667i(this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI$h */
    public static class C40636h {

        /* renamed from: a */
        public final ey4 f109154a;

        /* renamed from: b */
        public int f109155b;

        public C40636h() {
            this.f109155b = 0;
            this.f109154a = new ey4();
        }

        /* renamed from: a */
        public static C20937c m43871a(Context context, int i) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59359o = i;
            bVar.f59364t = true;
            if (C76577a.m92147C(context)) {
                bVar.f59365u = 0.1f * ((float) C76577a.m92155f(context, C0966R.dimen.f3626j));
            } else {
                bVar.f59365u = 0.1f * ((float) C76577a.m92155f(context, C0966R.dimen.f3919iy));
            }
            return bVar.mo32666a();
        }

        public C40636h(ey4 ey4) {
            this.f109155b = 0;
            this.f109154a = ey4;
        }
    }
}
