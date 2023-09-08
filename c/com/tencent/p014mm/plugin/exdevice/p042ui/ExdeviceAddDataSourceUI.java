package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceSimpleBTConnectDeviceEvent;
import com.tencent.p014mm.autogen.events.StopAllChannelEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.exdevice.model.C41123d1;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.model.C41170u0;
import com.tencent.p014mm.plugin.exdevice.model.C41175x;
import com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.file.XVFSFile;
import d81.C45288e;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p206nj.C11171e;
import pe3.C47465a;
import qo3.C89779i0;
import qw0.C47887a;
import sf0.C48374j0;
import te3.C48696ad;
import te3.C49485fx3;
import te3.C49697hf2;
import te3.C51163rv3;
import z71.C53754c;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI */
public class ExdeviceAddDataSourceUI extends MMActivity implements ExdeviceEventManager.C41111e, C11385n {

    /* renamed from: s */
    public static final /* synthetic */ int f110979s = 0;

    /* renamed from: d */
    public ListView f110980d;

    /* renamed from: e */
    public C41228j f110981e;

    /* renamed from: f */
    public List<C41230k> f110982f;

    /* renamed from: g */
    public TextView f110983g;

    /* renamed from: h */
    public TextView f110984h;

    /* renamed from: i */
    public TextView f110985i;

    /* renamed from: j */
    public View f110986j;

    /* renamed from: n */
    public RelativeLayout f110987n;

    /* renamed from: o */
    public boolean f110988o = false;

    /* renamed from: p */
    public C89779i0 f110989p;

    /* renamed from: q */
    public C41170u0 f110990q;

    /* renamed from: r */
    public final BroadcastReceiver f110991r = new C41214b();

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$a */
    public class C41213a implements MenuItem.OnMenuItemClickListener {
        public C41213a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceAddDataSourceUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$b */
    public class C41214b extends BroadcastReceiver {

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$b$a */
        public class C41215a implements Runnable {
            public C41215a() {
            }

            public void run() {
                if (!ExdeviceAddDataSourceUI.this.f110988o || LocationUtil.isGpsEnable()) {
                    ExdeviceAddDataSourceUI.this.mo64271H7(3);
                    Log.m105924i("MicroMsg.ExdeviceAddDataSourceUI", "Start scan...");
                    return;
                }
                ExdeviceAddDataSourceUI.this.mo64271H7(4);
            }
        }

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$b$b */
        public class C41216b implements Runnable {
            public C41216b() {
            }

            public void run() {
                ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = ExdeviceAddDataSourceUI.this;
                int i = ExdeviceAddDataSourceUI.f110979s;
                exdeviceAddDataSourceUI.mo64271H7(1);
                Log.m105924i("MicroMsg.ExdeviceAddDataSourceUI", "Stop scan...");
            }
        }

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$b$c */
        public class C41217c implements Runnable {
            public C41217c() {
            }

            public void run() {
                if (C47887a.m53196c()) {
                    ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = ExdeviceAddDataSourceUI.this;
                    int i = ExdeviceAddDataSourceUI.f110979s;
                    exdeviceAddDataSourceUI.mo64271H7(3);
                    Log.m105924i("MicroMsg.ExdeviceAddDataSourceUI", "Start scan...");
                    return;
                }
                ExdeviceAddDataSourceUI exdeviceAddDataSourceUI2 = ExdeviceAddDataSourceUI.this;
                int i2 = ExdeviceAddDataSourceUI.f110979s;
                exdeviceAddDataSourceUI2.mo64271H7(1);
            }
        }

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$b$d */
        public class C41218d implements Runnable {
            public C41218d() {
            }

            public void run() {
                ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = ExdeviceAddDataSourceUI.this;
                int i = ExdeviceAddDataSourceUI.f110979s;
                exdeviceAddDataSourceUI.mo64271H7(4);
                Log.m105924i("MicroMsg.ExdeviceAddDataSourceUI", "Stop scan...");
            }
        }

        public C41214b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                Log.m105924i("MicroMsg.ExdeviceAddDataSourceUI", "Receive action broadcast failed...");
                return;
            }
            String action = intent.getAction();
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 12) {
                    if (C47887a.m53196c()) {
                        ExdeviceAddDataSourceUI.this.runOnUiThread(new C41215a());
                        if (!ExdeviceAddDataSourceUI.this.f110988o || LocationUtil.isGpsEnable()) {
                            C41166r1.yx0().mo64174f();
                        }
                    }
                } else if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10 && !C47887a.m53196c()) {
                    ExdeviceAddDataSourceUI.this.runOnUiThread(new C41216b());
                    C41166r1.zx0().mo64195e();
                }
            }
            if (ExdeviceAddDataSourceUI.this.f110988o && "android.location.MODE_CHANGED".equals(action)) {
                if (LocationUtil.isGpsEnable()) {
                    ExdeviceAddDataSourceUI.this.runOnUiThread(new C41217c());
                    if (C47887a.m53196c()) {
                        C41166r1.yx0().mo64174f();
                        return;
                    }
                    return;
                }
                ExdeviceAddDataSourceUI.this.runOnUiThread(new C41218d());
                C41166r1.zx0().mo64195e();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$c */
    public class C41219c extends ClickableSpan {
        public C41219c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$3", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            AppCompatActivity context = ExdeviceAddDataSourceUI.this.getContext();
            C41175x.m44617c(context, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flo) + "/steprank/step/connect-help.html");
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$3", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$d */
    public class C41220d implements AdapterView.OnItemClickListener {
        public C41220d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C41230k kVar = (C41230k) ((LinkedList) ExdeviceAddDataSourceUI.this.f110981e.f111007d).get(i - ((ListView) adapterView).getHeaderViewsCount());
            if (kVar.f111015e != C41231l.NORMAL) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else if (!ExdeviceAddDataSourceUI.this.mo64272I7(kVar.f111012b, true)) {
                Log.m105924i("MicroMsg.ExdeviceAddDataSourceUI", "try connect device failed.");
                C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else {
                ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = ExdeviceAddDataSourceUI.this;
                String str = kVar.f111012b;
                exdeviceAddDataSourceUI.getClass();
                exdeviceAddDataSourceUI.runOnUiThread(new C41318b(exdeviceAddDataSourceUI, str));
                kVar.f111015e = C41231l.ADDING;
                ExdeviceAddDataSourceUI.this.f110981e.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$e */
    public class C41221e implements Runnable {
        public C41221e(ExdeviceAddDataSourceUI exdeviceAddDataSourceUI) {
        }

        public void run() {
            Log.m105918d("MicroMsg.ExdeviceAddDataSourceUI", "stopAllChannelEvent! ");
            new StopAllChannelEvent().publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$f */
    public class C41222f implements Runnable {
        public C41222f() {
        }

        public void run() {
            ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = ExdeviceAddDataSourceUI.this;
            C41228j jVar = exdeviceAddDataSourceUI.f110981e;
            List<C41230k> list = exdeviceAddDataSourceUI.f110982f;
            ((LinkedList) jVar.f111007d).clear();
            if (!(list == null || ((LinkedList) list).size() == 0)) {
                ((LinkedList) jVar.f111007d).addAll(list);
            }
            ExdeviceAddDataSourceUI.this.f110981e.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$g */
    public class C41223g implements Runnable {
        public C41223g() {
        }

        public void run() {
            View view = ExdeviceAddDataSourceUI.this.f110986j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ExdeviceAddDataSourceUI.this.f110981e.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$h */
    public class C41224h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C41230k f111002d;

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$h$a */
        public class C41225a implements DialogInterface.OnClickListener {
            public C41225a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C41224h hVar = C41224h.this;
                ((LinkedList) ExdeviceAddDataSourceUI.this.f110982f).remove(hVar.f111002d);
                ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = ExdeviceAddDataSourceUI.this;
                C41228j jVar = exdeviceAddDataSourceUI.f110981e;
                List<C41230k> list = exdeviceAddDataSourceUI.f110982f;
                ((LinkedList) jVar.f111007d).clear();
                if (!(list == null || ((LinkedList) list).size() == 0)) {
                    ((LinkedList) jVar.f111007d).addAll(list);
                }
                ExdeviceAddDataSourceUI.this.f110981e.notifyDataSetChanged();
            }
        }

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$h$b */
        public class C41226b implements DialogInterface.OnClickListener {
            public C41226b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                AppCompatActivity context = ExdeviceAddDataSourceUI.this.getContext();
                C41175x.m44617c(context, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flo) + "/steprank/step/connect-help.html");
            }
        }

        public C41224h(C41230k kVar) {
            this.f111002d = kVar;
        }

        public void run() {
            C76879j.m92740k(ExdeviceAddDataSourceUI.this, C0966R.string.f360389cd3, C0966R.string.f360387cd1, C0966R.string.f360388cd2, C0966R.string.cd4, false, new C41225a(), new C41226b()).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$i */
    public class C41227i implements Runnable {
        public C41227i() {
        }

        public void run() {
            ExdeviceAddDataSourceUI.this.f110981e.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$j */
    public static final class C41228j extends BaseAdapter {

        /* renamed from: d */
        public List<C41230k> f111007d = new LinkedList();

        /* renamed from: e */
        public C20937c f111008e;

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$j$a */
        public static class C41229a {

            /* renamed from: a */
            public ImageView f111009a;

            /* renamed from: b */
            public TextView f111010b;
        }

        public C41228j() {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.C0969drawable.f357145c00;
            this.f111008e = bVar.mo32666a();
        }

        /* renamed from: a */
        public C41230k mo64289a(String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            for (C41230k next : this.f111007d) {
                if (str.equalsIgnoreCase(next.f111012b)) {
                    return next;
                }
            }
            return null;
        }

        public int getCount() {
            return ((LinkedList) this.f111007d).size();
        }

        public Object getItem(int i) {
            return (C41230k) ((LinkedList) this.f111007d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C41229a aVar;
            C41230k kVar = (C41230k) ((LinkedList) this.f111007d).get(i);
            if (view == null) {
                aVar = new C41229a();
                view2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.a3w, (ViewGroup) null);
                aVar.f111009a = (ImageView) view2.findViewById(C0966R.C0970id.f1b);
                aVar.f111010b = (TextView) view2.findViewById(C0966R.C0970id.h_3);
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C41229a) view.getTag();
            }
            Log.m105919d("MicroMsg.ExdeviceAddDataSourceUI", "position(%s), name(%s), mac(%s).", Integer.valueOf(i), kVar.f111011a, kVar.f111012b);
            aVar.f111010b.setText(kVar.f111011a);
            C20828a.m22825b().mo32519h(kVar.f111014d, aVar.f111009a, this.f111008e);
            return view2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$k */
    public static class C41230k {

        /* renamed from: a */
        public String f111011a;

        /* renamed from: b */
        public String f111012b;

        /* renamed from: c */
        public String f111013c;

        /* renamed from: d */
        public String f111014d;

        /* renamed from: e */
        public C41231l f111015e = C41231l.NORMAL;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$l */
    public enum C41231l {
        NORMAL,
        ADDING,
        ADDED
    }

    /* renamed from: F4 */
    public void mo64188F4(String str, int i, long j) {
        C41231l lVar = C41231l.NORMAL;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, mac is null or nil.");
            return;
        }
        C41230k a = this.f110981e.mo64289a(str);
        if (a == null) {
            Log.m105929w("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, info is null.(%s)", str);
            return;
        }
        C41231l lVar2 = a.f111015e;
        C41231l lVar3 = C41231l.ADDING;
        if (lVar2 == lVar3 && i == 4) {
            a.f111015e = lVar;
            runOnUiThread(new C41315a(this));
            runOnUiThread(new C41224h(a));
        } else if (i == 2) {
            if (lVar2 == lVar3) {
                a.f111015e = C41231l.ADDED;
                Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "Bind Hard device, mac(%s), name(%s)", a.f111012b, a.f111011a);
                String str2 = a.f111013c;
                if (str2 != null) {
                    this.f110990q = new C41170u0(str2, 0);
                    C86709a0.m107529k().f251779b.mo123460f(this.f110990q);
                }
            } else {
                Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "try to disconnect, mac : %s.", str);
                mo64272I7(str, false);
            }
        } else if (i != 1 && i != 2) {
            a.f111015e = lVar;
        } else {
            return;
        }
        runOnUiThread(new C41227i());
    }

    /* renamed from: H7 */
    public final void mo64271H7(int i) {
        if (i == 1) {
            this.f110987n.setVisibility(8);
            this.f110984h.setText(C0966R.string.ccl);
            this.f110985i.setText(C0966R.string.cc6);
        } else if (i == 2) {
            this.f110987n.setVisibility(8);
            this.f110984h.setText(C0966R.string.ccj);
            this.f110985i.setText("");
        } else if (i == 3) {
            this.f110987n.setVisibility(0);
            View view = this.f110986j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i == 4) {
            this.f110987n.setVisibility(8);
            this.f110984h.setText(C0966R.string.ccl);
            this.f110985i.setText(C0966R.string.cdw);
        }
    }

    /* renamed from: I7 */
    public final boolean mo64272I7(String str, boolean z) {
        ExDeviceSimpleBTConnectDeviceEvent exDeviceSimpleBTConnectDeviceEvent = new ExDeviceSimpleBTConnectDeviceEvent();
        ExDeviceSimpleBTConnectDeviceEvent.C40080a aVar = exDeviceSimpleBTConnectDeviceEvent.f107484d;
        aVar.f107486a = str;
        aVar.f107487b = z;
        if (exDeviceSimpleBTConnectDeviceEvent.publish()) {
            return true;
        }
        Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "connect failed, mac(%s).", str);
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a3x;
    }

    /* renamed from: h1 */
    public void mo64189h1(String str, byte[] bArr, boolean z) {
    }

    public void initView() {
        this.f110980d = (ListView) findViewById(C0966R.C0970id.fph);
        View inflate = View.inflate(this, C0966R.C0971layout.a3z, (ViewGroup) null);
        this.f110987n = (RelativeLayout) findViewById(C0966R.C0970id.j4n);
        this.f110986j = View.inflate(this, C0966R.C0971layout.a3y, (ViewGroup) null);
        this.f110983g = (TextView) findViewById(C0966R.C0970id.j17);
        this.f110984h = (TextView) findViewById(C0966R.C0970id.ckn);
        this.f110985i = (TextView) findViewById(C0966R.C0970id.cko);
        String string = getString(C0966R.string.cfh);
        String string2 = getString(C0966R.string.f360386cd0);
        SpannableString spannableString = new SpannableString(string + string2);
        spannableString.setSpan(new ForegroundColorSpan(C0966R.color.a1d), string.length(), string.length() + string2.length(), 33);
        spannableString.setSpan(new C41219c(), string.length(), string.length() + string2.length(), 33);
        this.f110983g.setMovementMethod(LinkMovementMethod.getInstance());
        this.f110983g.setText(spannableString);
        this.f110980d.addHeaderView(inflate, (Object) null, false);
        this.f110980d.addFooterView(this.f110986j, (Object) null, false);
        C41228j jVar = new C41228j();
        this.f110981e = jVar;
        this.f110980d.setAdapter(jVar);
        this.f110980d.setOnItemClickListener(new C41220d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C41213a());
        setMMTitle((int) C0966R.string.cbv);
        if (C11171e.m11046c(23)) {
            String str = Build.VERSION.RELEASE;
            if (!str.equalsIgnoreCase("6.0") && !str.equalsIgnoreCase("6.0.0")) {
                this.f110988o = true;
            }
        }
        this.f110982f = new LinkedList();
        initView();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.location.MODE_CHANGED");
        getContext().registerReceiver(this.f110991r, intentFilter);
        C86709a0.m107529k().f251779b.mo123455a(536, this);
        C86709a0.m107529k().f251779b.mo123455a(1706, this);
        C41166r1.yx0().mo64185r(this);
        if (!C47887a.m53195b(getContext())) {
            Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "now sdk version not support ble device : %d", Integer.valueOf(Build.VERSION.SDK_INT));
            mo64271H7(2);
        } else if (!C47887a.m53196c()) {
            Log.m105924i("MicroMsg.ExdeviceAddDataSourceUI", "Bluetooth is not open, Just leave");
            mo64271H7(1);
        } else if (!this.f110988o || LocationUtil.isGpsEnable()) {
            try {
                C41166r1.yx0().mo64174f();
            } catch (Exception unused) {
            }
        } else {
            Log.m105924i("MicroMsg.ExdeviceAddDataSourceUI", "Android 6.0.1, gps not open");
            mo64271H7(4);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107525e().postToWorker(new C41221e(this));
        C86709a0.m107529k().f251779b.mo123470p(536, this);
        C86709a0.m107529k().f251779b.mo123470p(1706, this);
        getContext().unregisterReceiver(this.f110991r);
        boolean remove = ((LinkedList) C41166r1.yx0().f110715a).remove(this);
        C41166r1.zx0().mo64195e();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C47465a aVar;
        Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "errType(%d), errCode(%d), errMsg(%s).", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar == null) {
            Log.m105920e("MicroMsg.ExdeviceAddDataSourceUI", "netscene is null.");
        } else if (yVar.getType() == 536) {
            runOnUiThread(new C41315a(this));
            C48696ad adVar = null;
            this.f110990q = null;
            C47350c cVar = ((C41170u0) yVar).f110924e;
            if (!(cVar == null || (aVar = cVar.f127056b.f127083a) == null)) {
                adVar = (C48696ad) aVar;
            }
            if (i == 0 && i2 == 0) {
                Intent intent = new Intent();
                intent.putExtra("device_mac", C45288e.m50137h(C45288e.m50140k(adVar.f130441e.f135285f)));
                mo64272I7(C45288e.m50140k(adVar.f130441e.f135285f), false);
                setResult(-1, intent);
                finish();
                return;
            }
            C41230k a = this.f110981e.mo64289a(C45288e.m50140k(adVar.f130441e.f135285f));
            if (a != null) {
                a.f111015e = C41231l.NORMAL;
                mo64272I7(a.f111012b, false);
            }
            Log.m105920e("MicroMsg.ExdeviceAddDataSourceUI", "doScene failed.");
        } else if (yVar.getType() == 1706) {
            C49485fx3 fx32 = (C49485fx3) ((C41123d1) yVar).f110789e.f127056b.f127083a;
            if (i == 0 && i2 == 0) {
                Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "HardDeviceAttr_bleSimpleProtol(%d)", Long.valueOf(fx32.f133730e.f135300x));
                if (0 != (fx32.f133730e.f135300x & 1)) {
                    C53754c Bx0 = C41166r1.Bx0();
                    C49697hf2 hf22 = fx32.f133729d;
                    if (Bx0.mo74330Ow(hf22.f134597e, hf22.f134596d) != null) {
                        Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "(%s)has been bound.", fx32.f133730e.f135285f);
                        return;
                    }
                    C41230k kVar = new C41230k();
                    C51163rv3 rv32 = fx32.f133732g.f136426e;
                    kVar.f111011a = rv32 == null ? "" : C48374j0.m53718g(rv32);
                    kVar.f111012b = C45288e.m50140k(fx32.f133730e.f135285f);
                    kVar.f111013c = fx32.f133731f;
                    kVar.f111014d = fx32.f133730e.f135293q;
                    ((LinkedList) this.f110982f).add(kVar);
                    Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "Add device, mac(%s), name(%s)", kVar.f111012b, kVar.f111011a);
                    runOnUiThread(new C41222f());
                    return;
                }
                return;
            }
            Log.m105921e("MicroMsg.ExdeviceAddDataSourceUI", "NetSceneSearchBLEHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    /* renamed from: v2 */
    public void mo64190v2(String str, String str2, boolean z) {
        Log.m105919d("MicroMsg.ExdeviceAddDataSourceUI", "onScanResult, broadcastName(%s), mac(%s), isCompleted(%b).", str, str2, Boolean.valueOf(z));
        if (z) {
            runOnUiThread(new C41223g());
        }
        if (Util.isNullOrNil(str2)) {
            Log.m105921e("MicroMsg.ExdeviceAddDataSourceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", str, str2, Boolean.valueOf(z));
            return;
        }
        int i = 0;
        while (i < this.f110982f.size()) {
            C41230k kVar = this.f110982f.get(i);
            if (kVar == null || Util.isNullOrNil(kVar.f111012b)) {
                this.f110982f.remove(i);
                i--;
            } else if (kVar.f111012b.equalsIgnoreCase(str2)) {
                Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "the device(%s) has added into the list before.", str2);
                return;
            }
            i++;
        }
        Log.m105925i("MicroMsg.ExdeviceAddDataSourceUI", "SearchBLEHardDevice doScene result(%s), mac(%s)", Boolean.valueOf(C86709a0.m107529k().f251779b.mo123461g(new C41123d1(str2.replaceAll(XVFSFile.PATH_SEPARATOR, ""), (String) null, (String) null), 0)), str2);
    }
}
