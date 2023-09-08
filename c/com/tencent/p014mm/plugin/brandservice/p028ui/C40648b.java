package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.brandservice.p028ui.C40658c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C45829j;
import hx0.C46126a;
import j20.C117292a;
import java.io.IOException;
import k20.C60958c;
import k20.C9556a;
import p196ln.C76705f;
import p214om.C11502f;
import p629ny.C76979h;
import qj3.C47856a;
import te3.C49629gy3;
import te3.C51043r10;
import te3.C51163rv3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.b */
public class C40648b extends C46126a {

    /* renamed from: k */
    public static C47856a.C47858b f109191k;

    /* renamed from: h */
    public CharSequence f109192h;

    /* renamed from: i */
    public String f109193i;

    /* renamed from: j */
    public String f109194j;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.b$a */
    public class C40649a extends C47856a.C47858b {
        public C40649a(C40648b bVar) {
        }

        /* renamed from: a */
        public void mo63542a(View view, C47856a.C47857a aVar) {
            if (view != null && aVar != null && (aVar instanceof C40650b)) {
                C40650b bVar = (C40650b) aVar;
                bVar.f123739a = (ImageView) view.findViewById(C0966R.C0970id.a1q);
                bVar.f109196c = (TextView) view.findViewById(C0966R.C0970id.hfu);
                bVar.f109195b = (TextView) view.findViewById(C0966R.C0970id.bqq);
                bVar.f109199f = view.findViewById(C0966R.C0970id.a_l);
                bVar.f109198e = view.findViewById(C0966R.C0970id.l3u);
                bVar.f109197d = (TextView) view.findViewById(C0966R.C0970id.f8j);
            }
        }

        /* renamed from: b */
        public void mo63543b(Context context, C47856a.C47857a aVar, C47856a aVar2, Object... objArr) {
            Object obj;
            C47856a.C47857a aVar3 = aVar;
            C47856a aVar4 = aVar2;
            if (context == null || aVar3 == null || aVar4 == null || (obj = aVar4.f128456b) == null) {
                Log.m105920e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            } else if (!(aVar3 instanceof C40650b)) {
                Log.m105920e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of BizRecommViewHolder.");
            } else if (!(obj instanceof C49629gy3)) {
                Log.m105920e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of SearchOrRecommendItem.");
            } else {
                C40650b bVar = (C40650b) aVar3;
                C40648b bVar2 = (C40648b) aVar4;
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(bVar.f123739a, bVar2.f109193i);
                bVar.f109196c.setText(bVar2.f109192h, TextView.BufferType.SPANNABLE);
                View view = bVar.f109199f;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = bVar.f109198e;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar6.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                bVar.f109197d.setText((CharSequence) null, TextView.BufferType.SPANNABLE);
                C45829j.m51129b(bVar.f109195b, bVar2.f109194j);
            }
        }

        /* renamed from: c */
        public View mo63544c(Context context, ViewGroup viewGroup, View view) {
            return view == null ? View.inflate(context, C0966R.C0971layout.bvf, (ViewGroup) null) : view;
        }

        /* renamed from: d */
        public boolean mo63545d(Context context, View view, C47856a aVar, Object... objArr) {
            C40658c cVar;
            C40658c.C40660b bVar;
            C47856a aVar2 = aVar;
            Object[] objArr2 = objArr;
            if (!(aVar2 instanceof C40648b)) {
                return false;
            }
            C40648b bVar2 = (C40648b) aVar2;
            C49629gy3 gy32 = (C49629gy3) aVar2.f128456b;
            C51163rv3 rv32 = gy32.f134352e;
            String str = rv32 != null ? rv32.f141175d : null;
            C51163rv3 rv33 = gy32.f134351d;
            String str2 = rv33 != null ? rv33.f141175d : null;
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.BizRecommDataItem", "onItemClick but username is null");
                return false;
            }
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
            Intent intent = new Intent();
            if (z1Var.mo62927s3()) {
                intent.putExtra("Contact_User", str2);
                intent.putExtra("Contact_Scene", 55);
            } else {
                intent.putExtra("Contact_User", str2);
                intent.putExtra("Contact_Alias", gy32.f134361q);
                intent.putExtra("Contact_Nick", str);
                intent.putExtra("Contact_Signature", gy32.f134356i);
                intent.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(gy32.f134364t, gy32.f134354g, gy32.f134355h));
                intent.putExtra("Contact_Sex", gy32.f134353f);
                intent.putExtra("Contact_VUser_Info", gy32.f134359o);
                intent.putExtra("Contact_VUser_Info_Flag", gy32.f134358n);
                intent.putExtra("Contact_KWeibo_flag", gy32.f134363s);
                intent.putExtra("Contact_KWeibo", gy32.f134360p);
                intent.putExtra("Contact_KWeiboNick", gy32.f134362r);
                intent.putExtra("Contact_Scene", 55);
                C51043r10 r102 = gy32.f134365u;
                if (r102 != null) {
                    try {
                        intent.putExtra("Contact_customInfo", r102.toByteArray());
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.BizRecommDataItem", e, "", new Object[0]);
                    }
                }
            }
            Context context2 = context;
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, context);
            if (objArr2 != null && objArr2.length > 0) {
                Object obj = objArr2[0];
                if (obj instanceof C40658c) {
                    cVar = (C40658c) obj;
                    bVar = bVar2.f124289g;
                    if (bVar == null && cVar != null) {
                        bVar.mo63467a(cVar, aVar, 1, str2, bVar2.f124288f, bVar2.f124287e);
                        return true;
                    }
                }
            }
            cVar = null;
            bVar = bVar2.f124289g;
            return bVar == null ? true : true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.b$b */
    public static class C40650b extends C45829j.C45830a implements C47856a.C47857a {

        /* renamed from: b */
        public TextView f109195b;

        /* renamed from: c */
        public TextView f109196c;

        /* renamed from: d */
        public TextView f109197d;

        /* renamed from: e */
        public View f109198e;

        /* renamed from: f */
        public View f109199f;
    }

    public C40648b(Object obj, String str) {
        super(6, obj);
        this.f109194j = str;
    }

    /* renamed from: a */
    public void mo63539a(Context context, C47856a.C47857a aVar, Object... objArr) {
        Object obj;
        if (!this.f128457c) {
            if (context == null || aVar == null || (obj = this.f128456b) == null) {
                Log.m105920e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            } else if (!(aVar instanceof C40650b)) {
                Log.m105920e("MicroMsg.BizRecommDataItem", "The DataItem is not a instance of BizProductViewHolder.");
            } else if (!(obj instanceof C49629gy3)) {
                Log.m105920e("MicroMsg.BizRecommDataItem", "The data is not a instance of SearchOrRecommendItem.");
            } else {
                C40650b bVar = (C40650b) aVar;
                C49629gy3 gy32 = (C49629gy3) obj;
                C51163rv3 rv32 = gy32.f134352e;
                try {
                    this.f109192h = ((C76979h) C86312j.m106911c(C76979h.class)).yp0(context, rv32 != null ? rv32.f141175d : "", bVar.f109196c.getTextSize());
                } catch (Exception unused) {
                    this.f109192h = "";
                }
                this.f109193i = gy32.f134351d.f141175d;
            }
        }
    }

    /* renamed from: b */
    public C47856a.C47857a mo63540b() {
        return new C40650b();
    }

    /* renamed from: c */
    public C47856a.C47858b mo63541c() {
        if (f109191k == null) {
            f109191k = new C40649a(this);
        }
        return f109191k;
    }
}
