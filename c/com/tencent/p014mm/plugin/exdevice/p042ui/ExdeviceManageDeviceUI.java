package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceGetBoundDevicesEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.exdevice.model.C41135i1;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import d81.C45288e;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C77407n;
import qo3.C89779i0;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI */
public class ExdeviceManageDeviceUI extends MMActivity {

    /* renamed from: d */
    public ListView f111144d;

    /* renamed from: e */
    public C41271b f111145e;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI$a */
    public class C41270a implements MenuItem.OnMenuItemClickListener {
        public C41270a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceManageDeviceUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI$b */
    public static final class C41271b extends BaseAdapter implements C11385n {

        /* renamed from: d */
        public List<C53753b> f111147d;

        /* renamed from: e */
        public boolean f111148e;

        /* renamed from: f */
        public WeakReference<Context> f111149f;

        /* renamed from: g */
        public C20937c f111150g;

        /* renamed from: h */
        public View.OnClickListener f111151h;

        /* renamed from: i */
        public C89779i0 f111152i = null;

        /* renamed from: j */
        public volatile int f111153j = -1;

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI$b$a */
        public class C41272a implements View.OnClickListener {
            public C41272a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (C41271b.this.f111148e) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                Object tag = view.getTag();
                if (tag == null || !(tag instanceof Integer)) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                int intValue = ((Integer) tag).intValue();
                if (intValue < 0 || intValue >= C41271b.this.getCount()) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C53753b bVar = (C53753b) ((LinkedList) C41271b.this.f111147d).get(intValue);
                Context context = C41271b.this.f111149f.get();
                if (context == null) {
                    Log.m105920e("MicroMsg.ExdeviceManageDeviceUI", "Start activity failed, context is null.");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C41271b.this.getClass();
                Intent intent = new Intent();
                intent.putExtra("device_type", bVar.field_deviceType);
                intent.putExtra(TPDownloadProxyEnum.USER_DEVICE_ID, bVar.field_deviceID);
                intent.putExtra("device_mac", bVar.field_mac);
                intent.putExtra("device_brand_name", bVar.field_brandName);
                intent.putExtra("device_desc", bVar.f150086C);
                intent.putExtra("device_title", bVar.f150085B);
                intent.putExtra("device_icon_url", bVar.f150114z);
                intent.putExtra("device_alias", bVar.f150113y);
                intent.putExtra("device_jump_url", bVar.f150084A);
                intent.putExtra("subscribe_flag", 1);
                C88144b.m109795m(context, "exdevice", ".ui.ExdeviceDeviceProfileUI", intent, 1000);
                C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI$b$b */
        public class C41273b implements Runnable {
            public C41273b() {
            }

            public void run() {
                C41271b bVar = C41271b.this;
                ((LinkedList) bVar.f111147d).remove(bVar.f111153j);
                C41271b.this.notifyDataSetChanged();
                C41271b.this.f111153j = -1;
            }
        }

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI$b$c */
        public static class C41274c {

            /* renamed from: a */
            public View f111156a;

            /* renamed from: b */
            public View f111157b;

            /* renamed from: c */
            public TextView f111158c;

            /* renamed from: d */
            public ImageView f111159d;
        }

        public C41271b(Context context, String str) {
            this.f111149f = new WeakReference<>(context);
            this.f111147d = new LinkedList();
            LayoutInflater.from(context);
            new C77407n(context, 1, false);
            new ArrayList();
            new ArrayList();
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.C0969drawable.bfs;
            this.f111150g = bVar.mo32666a();
            this.f111151h = new C41272a();
            List<C53753b> bF = C41166r1.Bx0().mo74335bF();
            ((LinkedList) this.f111147d).clear();
            if (((LinkedList) bF).size() != 0) {
                ((LinkedList) this.f111147d).addAll(bF);
            }
        }

        public int getCount() {
            return ((LinkedList) this.f111147d).size();
        }

        public Object getItem(int i) {
            return (C53753b) ((LinkedList) this.f111147d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C41274c cVar;
            String str;
            C53753b bVar = (C53753b) ((LinkedList) this.f111147d).get(i);
            String str2 = null;
            if (view == null) {
                cVar = new C41274c();
                view2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.a4g, (ViewGroup) null);
                cVar.f111156a = view2.findViewById(C0966R.C0970id.f357785br0);
                cVar.f111158c = (TextView) view2.findViewById(C0966R.C0970id.h_3);
                cVar.f111157b = view2.findViewById(C0966R.C0970id.c17);
                cVar.f111159d = (ImageView) view2.findViewById(C0966R.C0970id.f1b);
                view2.setTag(cVar);
            } else {
                cVar = (C41274c) view.getTag();
                view2 = view;
            }
            if (bVar == null) {
                str = "";
            } else {
                if (!Util.isNullOrNil(bVar.f150113y)) {
                    str2 = bVar.f150113y;
                } else if (!Util.isNullOrNil(bVar.f150085B)) {
                    str2 = bVar.f150085B;
                } else {
                    long j = bVar.field_mac;
                    if (j != 0) {
                        str2 = C45288e.m50135f(j);
                    } else if (!Util.isNullOrNil(bVar.field_deviceID)) {
                        str2 = bVar.field_deviceID;
                    }
                }
                str = Util.nullAsNil(str2);
            }
            Log.m105919d("MicroMsg.ExdeviceManageDeviceUI", "position(%s), name(%s), mac(%s).", Integer.valueOf(i), str, Long.valueOf(bVar.field_mac));
            cVar.f111158c.setText(str);
            C20828a.m22825b().mo32519h(bVar.f150114z, cVar.f111159d, this.f111150g);
            cVar.f111157b.setTag(Integer.valueOf(i));
            if (this.f111148e) {
                View view3 = cVar.f111157b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view5 = cVar.f111157b;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            cVar.f111156a.setTag(Integer.valueOf(i));
            cVar.f111156a.setOnClickListener(this.f111151h);
            return view2;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar == null) {
                Log.m105920e("MicroMsg.ExdeviceManageDeviceUI", "scene is null.");
            } else if (yVar instanceof C41135i1) {
                C89779i0 i0Var = this.f111152i;
                if (i0Var != null && i0Var.isShowing()) {
                    this.f111152i.dismiss();
                }
                if (i == 0 && i2 == 0 && this.f111153j >= 0 && this.f111153j < ((LinkedList) this.f111147d).size()) {
                    MMHandlerThread.postToMainThread(new C41273b());
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a4h;
    }

    public void initView() {
        this.f111144d = (ListView) findViewById(C0966R.C0970id.fph);
        this.f111145e = new C41271b(this, (String) null);
        View.inflate(this, C0966R.C0971layout.a44, (ViewGroup) null);
        this.f111144d.setAdapter(this.f111145e);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C41271b bVar = this.f111145e;
        List<C53753b> bF = C41166r1.Bx0().mo74335bF();
        ((LinkedList) bVar.f111147d).clear();
        if (((LinkedList) bF).size() != 0) {
            ((LinkedList) bVar.f111147d).addAll(bF);
        }
        this.f111145e.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C41270a());
        setMMTitle((int) C0966R.string.ce9);
        ExDeviceGetBoundDevicesEvent exDeviceGetBoundDevicesEvent = new ExDeviceGetBoundDevicesEvent();
        exDeviceGetBoundDevicesEvent.f107445d.f107446a = true;
        exDeviceGetBoundDevicesEvent.publish();
        initView();
        C86709a0.m107529k().f251779b.mo123455a(537, this.f111145e);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(537, this.f111145e);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || !this.f111145e.f111148e) {
            return super.onKeyDown(i, keyEvent);
        }
        updateOptionMenuText(0, getString(C0966R.string.f7956xe));
        C41271b bVar = this.f111145e;
        if (!bVar.f111148e) {
            return true;
        }
        bVar.f111148e = false;
        MMHandlerThread.postToMainThread(new C41376u(bVar));
        return true;
    }
}
