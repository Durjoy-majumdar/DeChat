package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import bd1.C54446b;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.HeadImgNewPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import d62.C75339i;
import di3.C86312j;
import er1.C58684b;
import f14.C58901s;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k60.C60979d;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import nj3.C76879j;
import nj3.C76912y0;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C77426q;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C49849ii0;
import te3.C50119ke1;
import te3.C50251le1;
import te3.C50542nh0;
import te3.C52261zg3;
import te3.C64553md1;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66783a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingDetailInfoUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "Lht1/p5;", "Lte3/md1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI */
public class FinderSettingDetailInfoUI extends MMPreference implements C8794p5<C64553md1> {

    /* renamed from: d */
    public final String f17058d = "Finder.FinderSettingDetailInfoUI";

    /* renamed from: e */
    public final int f17059e = 1000;

    /* renamed from: f */
    public final int f17060f = 1001;

    /* renamed from: g */
    public final int f17061g = 1002;

    /* renamed from: h */
    public final int f17062h = 1003;

    /* renamed from: i */
    public String f17063i;

    /* renamed from: j */
    public C58969q f17064j;

    /* renamed from: n */
    public C50119ke1 f17065n;

    /* renamed from: o */
    public ProgressDialog f17066o;

    /* renamed from: p */
    public C3866n2 f17067p;

    /* renamed from: q */
    public boolean f17068q;

    /* renamed from: r */
    public boolean f17069r;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$doPrepareUser$1", mo125469f = "FinderSettingDetailInfoUI.kt", mo125470l = {100, 102}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$a */
    public static final class C3719a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f17070d;

        /* renamed from: e */
        public int f17071e;

        /* renamed from: f */
        public final /* synthetic */ FinderSettingDetailInfoUI f17072f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$doPrepareUser$1$1$1", mo125469f = "FinderSettingDetailInfoUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$a$a */
        public static final class C3720a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ FinderSettingDetailInfoUI f17073d;

            /* renamed from: e */
            public final /* synthetic */ C50119ke1 f17074e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3720a(FinderSettingDetailInfoUI finderSettingDetailInfoUI, C50119ke1 ke12, C15601d<? super C3720a> dVar) {
                super(2, dVar);
                this.f17073d = finderSettingDetailInfoUI;
                this.f17074e = ke12;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C3720a(this.f17073d, this.f17074e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C3720a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                FinderSettingDetailInfoUI finderSettingDetailInfoUI = this.f17073d;
                C50119ke1 ke12 = this.f17074e;
                finderSettingDetailInfoUI.f17065n = ke12;
                if (ke12 != null) {
                    finderSettingDetailInfoUI.mo4110K7();
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3719a(FinderSettingDetailInfoUI finderSettingDetailInfoUI, C15601d<? super C3719a> dVar) {
            super(2, dVar);
            this.f17072f = finderSettingDetailInfoUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3719a(this.f17072f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C3719a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f17071e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66785b bVar = C66785b.f191882e;
                this.f17071e = 1;
                obj2 = bVar.mo90679u0(2, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m168123unboximpl();
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FinderSettingDetailInfoUI finderSettingDetailInfoUI = this.f17072f;
            if (Result.m168121isSuccessimpl(obj2)) {
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C3720a aVar2 = new C3720a(finderSettingDetailInfoUI, (C50119ke1) obj2, (C15601d<? super C3720a>) null);
                this.f17070d = obj2;
                this.f17071e = 2;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$b */
    public static final class C3721b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C3721b f17075d = new C3721b();

        public C3721b() {
            super(0);
        }

        public Object invoke() {
            C5139t.m5183e(5, 16);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$c */
    public static final class C3722c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C3722c f17076d = new C3722c();

        public C3722c() {
            super(0);
        }

        public Object invoke() {
            C5139t.m5183e(5, 15);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$d */
    public static final class C3723d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingDetailInfoUI f17077d;

        public C3723d(FinderSettingDetailInfoUI finderSettingDetailInfoUI) {
            this.f17077d = finderSettingDetailInfoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f17077d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$e */
    public static final class C3724e implements HeadImgNewPreference.C6760a {

        /* renamed from: a */
        public final /* synthetic */ FinderSettingDetailInfoUI f17078a;

        public C3724e(FinderSettingDetailInfoUI finderSettingDetailInfoUI) {
            this.f17078a = finderSettingDetailInfoUI;
        }

        /* renamed from: a */
        public void mo4113a(String str, ImageView imageView, boolean z) {
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(str, "username");
            C87412m.m108594g(imageView, "icon");
            FinderSettingDetailInfoUI finderSettingDetailInfoUI = this.f17078a;
            if (finderSettingDetailInfoUI.f17064j == null) {
                Log.m105920e(finderSettingDetailInfoUI.f17058d, "error self contact is null");
                return;
            }
            C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C58969q qVar = this.f17078a.f17064j;
            C87412m.m108591d(qVar);
            i2.mo85957c(new C62345f(qVar.field_avatarUrl, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$f */
    public static final class C3725f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingDetailInfoUI f17079d;

        public C3725f(FinderSettingDetailInfoUI finderSettingDetailInfoUI) {
            this.f17079d = finderSettingDetailInfoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderSettingDetailInfoUI$updateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderSettingDetailInfoUI finderSettingDetailInfoUI = this.f17079d;
            if (finderSettingDetailInfoUI.f17063i != null) {
                Intent intent = new Intent();
                C58969q qVar = finderSettingDetailInfoUI.f17064j;
                C87412m.m108591d(qVar);
                intent.putStringArrayListExtra("key_url_list", C64197v.m75534c(qVar.getAvatarUrl()));
                intent.putExtra("key_preview_avatar", true);
                ((C58684b) C86312j.m106911c(C58684b.class)).Kx0(finderSettingDetailInfoUI, intent);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderSettingDetailInfoUI$updateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: I7 */
    public static final void m3906I7(FinderSettingDetailInfoUI finderSettingDetailInfoUI) {
        Intent intent = new Intent();
        intent.putExtra("key_scene", 1);
        ((C58684b) C86312j.m106911c(C58684b.class)).iy0(finderSettingDetailInfoUI, intent);
    }

    /* renamed from: J7 */
    public static final void m3907J7(FinderSettingDetailInfoUI finderSettingDetailInfoUI, int i) {
        C77426q qVar = new C77426q(finderSettingDetailInfoUI);
        qVar.mo107595g(finderSettingDetailInfoUI.getString(i));
        qVar.mo107589a(true);
        qVar.mo107602n(finderSettingDetailInfoUI.getString(C0966R.string.f360452cy1));
        qVar.mo107603o();
    }

    /* renamed from: H7 */
    public final void mo4109H7() {
        if (!this.f17069r) {
            C53895h.m60466d(getLifecycleAsyncScope(), (C66212f) null, (C53934p0) null, new C3719a(this, (C15601d<? super C3719a>) null), 3, (Object) null);
        }
    }

    /* renamed from: K7 */
    public final void mo4110K7() {
        C49849ii0 ii02;
        C13598b0 b0Var;
        C49849ii0 ii03;
        FinderAuthInfo finderAuthInfo;
        C50119ke1 ke12;
        C50251le1 le12;
        T t;
        Class cls = C76979h.class;
        C58969q b = C58961d.f168673a.mo84155b(Util.nullAsNil(this.f17063i));
        this.f17064j = b;
        if (b == null) {
            finish();
            return;
        }
        Preference a = getPreferenceScreen().mo72519a("settings_avatar");
        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.HeadImgNewPreference");
        HeadImgNewPreference headImgNewPreference = (HeadImgNewPreference) a;
        headImgNewPreference.f24244S = new C3724e(this);
        boolean z = true;
        headImgNewPreference.f24241P = true;
        headImgNewPreference.mo7739I(this.f17063i);
        headImgNewPreference.f24242Q = new C3725f(this);
        Preference a2 = getPreferenceScreen().mo72519a("settings_nickname");
        a2.f121269E = true;
        C66785b bVar = C66785b.f191882e;
        String str = this.f17063i;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        FinderAuthInfo finderAuthInfo2 = null;
        boolean z2 = false;
        C54446b a3 = C66783a.C66784a.m78798a(bVar, str, false, 2, (Object) null);
        int i = a3 != null ? a3.mo75251m2().f132494e : 0;
        Log.m105925i(this.f17058d, "userFlag %d", Integer.valueOf(i));
        if ((i & 2) == 0 || (ke12 = this.f17065n) == null) {
            C58969q qVar = this.f17064j;
            C87412m.m108591d(qVar);
            a2.mo7741E(((C76979h) C86312j.m106911c(cls)).mo107057T1(this, qVar.getNickname()));
        } else {
            LinkedList<C52261zg3> linkedList = ke12.f136709z;
            if (linkedList != null) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    FinderContact finderContact = ((C52261zg3) t).f145918e;
                    if (C87412m.m108589b(finderContact != null ? finderContact.username : null, this.f17063i)) {
                        break;
                    }
                }
                C52261zg3 zg32 = (C52261zg3) t;
                if (zg32 != null) {
                    le12 = zg32.f145917d;
                    C76979h hVar = (C76979h) C86312j.m106911c(cls);
                    Object[] objArr = new Object[1];
                    if (le12 == null || (r3 = le12.f137360h) == null) {
                        String str3 = str2;
                    }
                    objArr[0] = str3;
                    a2.mo7741E(hVar.mo107057T1(this, getString(C0966R.string.eet, objArr)));
                }
            }
            le12 = null;
            C76979h hVar2 = (C76979h) C86312j.m106911c(cls);
            Object[] objArr2 = new Object[1];
            String str32 = str2;
            objArr2[0] = str32;
            a2.mo7741E(hVar2.mo107057T1(this, getString(C0966R.string.eet, objArr2)));
        }
        Preference a4 = getPreferenceScreen().mo72519a("settings_signature");
        a4.f121269E = true;
        C58969q qVar2 = this.f17064j;
        C87412m.m108591d(qVar2);
        a4.mo7741E(((C76979h) C86312j.m106911c(cls)).mo107057T1(this, qVar2.field_signature));
        Preference a5 = getPreferenceScreen().mo72519a("settings_sex");
        C58969q qVar3 = this.f17064j;
        if ((qVar3 == null || (finderAuthInfo = qVar3.field_authInfo) == null || finderAuthInfo.authIconType != 2) ? false : true) {
            a5.mo7741E(getString(C0966R.string.eow));
            a5.mo69921C(8);
            a5.mo69932y(false);
        } else {
            if (qVar3 == null || (ii03 = qVar3.field_extInfo) == null) {
                b0Var = null;
            } else {
                Log.m105924i(this.f17058d, "sex " + ii03.f135356g);
                int i2 = ii03.f135356g;
                if (i2 == 1) {
                    a5.mo7741E(getString(C0966R.string.f361346j32));
                } else if (i2 == 2) {
                    a5.mo7741E(getString(C0966R.string.f361345j31));
                } else {
                    a5.mo7741E(str2);
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                a5.mo7741E(str2);
            }
            a5.mo69921C(0);
            a5.mo69932y(true);
        }
        C66785b bVar2 = C66785b.f191882e;
        C58969q qVar4 = this.f17064j;
        String str4 = qVar4 != null ? qVar4.field_username : null;
        if (str4 == null) {
            str4 = str2;
        }
        C54446b a6 = C66783a.C66784a.m78798a(bVar2, str4, false, 2, (Object) null);
        int i3 = a6 != null ? a6.field_extFlag : 0;
        Log.m105924i(this.f17058d, "updateView userExtFlag:" + i3);
        Preference a7 = getPreferenceScreen().mo72519a("settings_district");
        if ((i3 & 4) > 0) {
            C58969q qVar5 = this.f17064j;
            if (!(qVar5 == null || (ii02 = qVar5.field_extInfo) == null)) {
                Log.m105924i(this.f17058d, "countryCode " + ii02.f135353d + " provinceCode " + ii02.f135354e + " cityCode " + ii02.f135355f);
                String l = RegionCodeDecoder.m124563k().mo135576l(ii02.f135353d);
                String m = RegionCodeDecoder.m124563k().mo135577m(ii02.f135353d, ii02.f135354e);
                String f = RegionCodeDecoder.m124563k().mo135571f(ii02.f135353d, ii02.f135354e, ii02.f135355f);
                if (!Util.isNullOrNil(f)) {
                    a7.mo7741E(((C75339i) C86312j.m106911c(C75339i.class)).K90(m) + ' ' + f);
                } else if (!Util.isNullOrNil(m)) {
                    a7.mo7741E(l + ' ' + m);
                } else if (!Util.isNullOrNil(l)) {
                    a7.mo7741E(l);
                } else {
                    a7.mo7741E(str2);
                }
            }
        } else {
            a7.mo7741E(str2);
        }
        C58969q b2 = C58961d.f168673a.mo84155b(this.f17063i);
        if (b2 != null) {
            finderAuthInfo2 = b2.field_authInfo;
        }
        if (finderAuthInfo2 == null) {
            String str5 = this.f17058d;
            StringBuilder sb = new StringBuilder();
            sb.append("refresh  profileContact=");
            if (b2 == null) {
                z = false;
            }
            sb.append(z);
            Log.m105928w(str5, sb.toString());
        } else {
            boolean d6 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83785d6();
            if (b2 != null) {
                if (d6 && finderAuthInfo2.authIconType == 2 && b2.field_coverEntranceFlag == 1) {
                    z2 = true;
                }
                Log.m105924i(this.f17058d, "isOpen:" + z2);
                if (!z2) {
                    getPreferenceScreen().mo72531o("settings_profile_cover");
                } else {
                    String str6 = b2.field_coverUrl;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    this.f17068q = !Util.isNullOrNil(str2);
                }
            }
        }
        getPreferenceScreen().notifyDataSetChanged();
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C87412m.m108594g((C64553md1) obj, "req");
        C87412m.m108594g(nh02, "ret");
        ProgressDialog progressDialog = this.f17066o;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (nh02.f138603e == 0) {
            C76912y0.makeText((Context) this, (CharSequence) getString(C0966R.string.et9), 0).show();
        } else {
            C76912y0.makeText((Context) this, (CharSequence) getString(C0966R.string.et6), 0).show();
        }
        if (this.f17069r || nh02.f138603e == 0) {
            this.f17069r = false;
            mo4109H7();
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8899au;
    }

    /* JADX WARNING: type inference failed for: r13v8, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r21, int r22, android.content.Intent r23) {
        /*
            r20 = this;
            r6 = r20
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.Class<com.tencent.mm.plugin.finder.service.p1> r3 = com.tencent.p014mm.plugin.finder.service.C3605p1.class
            super.onActivityResult(r21, r22, r23)
            int r4 = r6.f17059e
            r5 = -1
            if (r0 != r4) goto L_0x006a
            if (r2 == 0) goto L_0x0397
            if (r1 != r5) goto L_0x0397
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r6.setIntent(r0)
            androidx.appcompat.app.AppCompatActivity r0 = r20.getContext()
            java.lang.String r1 = f12.C7970a.m8127a()
            java.lang.String r0 = com.tencent.p014mm.p136ui.tools.C7013o.m7260b(r0, r2, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0061
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x0061
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r2 = "key_source_img_path"
            r1.putExtra(r2, r0)
            java.lang.Class<er1.b> r0 = er1.C58684b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            er1.b r0 = (er1.C58684b) r0
            android.content.Intent r1 = r20.getIntent()
            int r2 = r6.f17060f
            r0.getClass()
            java.lang.Class<lr.b> r0 = p599lr.C61381b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            lr.b r0 = (p599lr.C61381b) r0
            qo1.i r0 = r0.Yp0()
            r0.mo88200k(r6, r1, r2)
            goto L_0x0397
        L_0x0061:
            java.lang.String r0 = r6.f17058d
            java.lang.String r1 = "no img select"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x0397
        L_0x006a:
            int r4 = r6.f17060f
            java.lang.String r7 = "key_result_img_path"
            r8 = 1
            r9 = 0
            if (r0 != r4) goto L_0x00b7
            if (r2 == 0) goto L_0x0397
            if (r1 != r5) goto L_0x0397
            java.lang.String r0 = r2.getStringExtra(r7)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x00ae
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = r6.f17058d
            java.lang.Object[] r2 = new java.lang.Object[r8]
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r7 = 1024(0x400, float:1.435E-42)
            long r7 = (long) r7
            long r4 = r4 / r7
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2[r9] = r4
            java.lang.String r4 = "avatar file length %d KB"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r2)
            di3.d r1 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.finder.service.p1 r1 = (com.tencent.p014mm.plugin.finder.service.C3605p1) r1
            gy3.C87412m.m108591d(r0)
            r1.Ra0(r0, r6)
            r20.showProgress()
            goto L_0x0397
        L_0x00ae:
            java.lang.String r0 = r6.f17058d
            java.lang.String r1 = "no avatar set"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x0397
        L_0x00b7:
            int r4 = r6.f17061g
            java.lang.String r10 = "unshow"
            r11 = 2
            java.lang.String r12 = ""
            r13 = 0
            if (r0 != r4) goto L_0x0196
            if (r2 == 0) goto L_0x0397
            if (r1 != r5) goto L_0x0397
            java.lang.String r0 = "Country"
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 != 0) goto L_0x00cf
            r0 = r12
        L_0x00cf:
            java.lang.String r1 = "Contact_Province"
            java.lang.String r1 = r2.getStringExtra(r1)
            if (r1 != 0) goto L_0x00d9
            r4 = r12
            goto L_0x00da
        L_0x00d9:
            r4 = r1
        L_0x00da:
            java.lang.String r1 = "Contact_City"
            java.lang.String r1 = r2.getStringExtra(r1)
            if (r1 != 0) goto L_0x00e4
            r5 = r12
            goto L_0x00e5
        L_0x00e4:
            r5 = r1
        L_0x00e5:
            java.lang.String r1 = r6.f17058d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "countryCode "
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = " provinceCode"
            r2.append(r7)
            r2.append(r4)
            java.lang.String r7 = " cityCode"
            r2.append(r7)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            boolean r1 = gy3.C87412m.m108589b(r0, r10)
            if (r1 == 0) goto L_0x0157
            zc1.b r0 = zc1.C66785b.f191882e
            fe1.q r1 = r6.f17064j
            if (r1 == 0) goto L_0x011a
            java.lang.String r1 = r1.field_username
            goto L_0x011b
        L_0x011a:
            r1 = r13
        L_0x011b:
            if (r1 != 0) goto L_0x011e
            r1 = r12
        L_0x011e:
            bd1.b r1 = zc1.C66783a.C66784a.m78798a(r0, r1, r9, r11, r13)
            if (r1 == 0) goto L_0x0126
            int r9 = r1.field_extFlag
        L_0x0126:
            r1 = r9 & -5
            bd1.c r2 = new bd1.c
            fe1.q r7 = r6.f17064j
            if (r7 == 0) goto L_0x0131
            java.lang.String r7 = r7.field_username
            goto L_0x0132
        L_0x0131:
            r7 = r13
        L_0x0132:
            if (r7 != 0) goto L_0x0135
            r7 = r12
        L_0x0135:
            r2.<init>(r7)
            r2.field_extFlag = r1
            bd1.i r7 = bd1.C39759i.MODIFY_USER
            r0.mo90672m1(r2, r7)
            bd1.c r2 = new bd1.c
            fe1.q r9 = r6.f17064j
            if (r9 == 0) goto L_0x0148
            java.lang.String r9 = r9.field_username
            goto L_0x0149
        L_0x0148:
            r9 = r13
        L_0x0149:
            if (r9 != 0) goto L_0x014c
            r9 = r12
        L_0x014c:
            r2.<init>(r9)
            r2.field_extFlag = r1
            r0.mo90672m1(r2, r7)
            r1 = r12
            r9 = 1
            goto L_0x0158
        L_0x0157:
            r1 = r0
        L_0x0158:
            fe1.q r0 = r6.f17064j
            if (r0 == 0) goto L_0x017e
            te3.ii0 r2 = r0.field_extInfo
            if (r2 == 0) goto L_0x0168
            r2.f135353d = r1
            r2.f135354e = r4
            r2.f135355f = r5
            rx3.b0 r13 = rx3.C13598b0.f38549a
        L_0x0168:
            if (r13 != 0) goto L_0x0177
            te3.ii0 r2 = new te3.ii0
            r2.<init>()
            r0.field_extInfo = r2
            r2.f135353d = r1
            r2.f135354e = r4
            r2.f135355f = r5
        L_0x0177:
            fe1.d$b r2 = fe1.C58961d.f168673a
            r2.mo84166o(r0)
            r6.f17069r = r8
        L_0x017e:
            di3.d r0 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.finder.service.p1 r0 = (com.tencent.p014mm.plugin.finder.service.C3605p1) r0
            r2 = r4
            r3 = r5
            r4 = r9
            r5 = r20
            r0.mo3980OR(r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$b r0 = com.tencent.p014mm.plugin.finder.p056ui.FinderSettingDetailInfoUI.C3721b.f17075d
            o40.C61926c.m72668M(r0)
            r20.showProgress()
            goto L_0x0397
        L_0x0196:
            int r4 = r6.f17062h
            if (r0 != r4) goto L_0x02d0
            if (r2 == 0) goto L_0x0397
            if (r1 != r5) goto L_0x0397
            java.lang.String r0 = "key_output_sex"
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 != 0) goto L_0x01a7
            r0 = r12
        L_0x01a7:
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x01af
            r1 = 1
            goto L_0x01b0
        L_0x01af:
            r1 = 0
        L_0x01b0:
            if (r1 == 0) goto L_0x0397
            zc1.b r1 = zc1.C66785b.f191882e
            fe1.q r2 = r6.f17064j
            if (r2 == 0) goto L_0x01bb
            java.lang.String r2 = r2.field_username
            goto L_0x01bc
        L_0x01bb:
            r2 = r13
        L_0x01bc:
            if (r2 != 0) goto L_0x01bf
            r2 = r12
        L_0x01bf:
            bd1.b r2 = zc1.C66783a.C66784a.m78798a(r1, r2, r9, r11, r13)
            if (r2 == 0) goto L_0x01c8
            int r2 = r2.field_extFlag
            goto L_0x01c9
        L_0x01c8:
            r2 = 0
        L_0x01c9:
            fe1.q r4 = r6.f17064j
            if (r4 == 0) goto L_0x02cb
            int r5 = r0.hashCode()
            r7 = -1278174388(0xffffffffb3d09b4c, float:-9.714003E-8)
            if (r5 == r7) goto L_0x0278
            r7 = -840239850(0xffffffffcdeaf516, float:-4.92741312E8)
            if (r5 == r7) goto L_0x022f
            r7 = 3343885(0x33060d, float:4.685781E-39)
            if (r5 == r7) goto L_0x01e2
            goto L_0x0280
        L_0x01e2:
            java.lang.String r5 = "male"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0280
            te3.ii0 r0 = r4.field_extInfo
            if (r0 == 0) goto L_0x01f3
            r0.f135356g = r8
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x01f4
        L_0x01f3:
            r0 = r13
        L_0x01f4:
            if (r0 != 0) goto L_0x01ff
            te3.ii0 r0 = new te3.ii0
            r0.<init>()
            r4.field_extInfo = r0
            r0.f135356g = r8
        L_0x01ff:
            fe1.d$b r0 = fe1.C58961d.f168673a
            r0.mo84166o(r4)
            r0 = r2 | 8
            bd1.c r2 = new bd1.c
            fe1.q r5 = r6.f17064j
            if (r5 == 0) goto L_0x020e
            java.lang.String r13 = r5.field_username
        L_0x020e:
            if (r13 != 0) goto L_0x0211
            goto L_0x0212
        L_0x0211:
            r12 = r13
        L_0x0212:
            r2.<init>(r12)
            r2.field_extFlag = r0
            bd1.i r0 = bd1.C39759i.MODIFY_USER
            r1.mo90672m1(r2, r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.finder.service.p1 r0 = (com.tencent.p014mm.plugin.finder.service.C3605p1) r0
            te3.ii0 r1 = r4.field_extInfo
            if (r1 == 0) goto L_0x0229
            int r1 = r1.f135356g
            goto L_0x022a
        L_0x0229:
            r1 = 0
        L_0x022a:
            r0.dp0(r1, r9, r6)
            goto L_0x02c4
        L_0x022f:
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0236
            goto L_0x0280
        L_0x0236:
            te3.ii0 r0 = r4.field_extInfo
            if (r0 == 0) goto L_0x023f
            r0.f135356g = r9
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0240
        L_0x023f:
            r0 = r13
        L_0x0240:
            if (r0 != 0) goto L_0x024b
            te3.ii0 r0 = new te3.ii0
            r0.<init>()
            r4.field_extInfo = r0
            r0.f135356g = r9
        L_0x024b:
            fe1.d$b r0 = fe1.C58961d.f168673a
            r0.mo84166o(r4)
            r0 = r2 & -9
            bd1.c r2 = new bd1.c
            fe1.q r5 = r6.f17064j
            if (r5 == 0) goto L_0x025a
            java.lang.String r13 = r5.field_username
        L_0x025a:
            if (r13 != 0) goto L_0x025d
            goto L_0x025e
        L_0x025d:
            r12 = r13
        L_0x025e:
            r2.<init>(r12)
            r2.field_extFlag = r0
            bd1.i r0 = bd1.C39759i.MODIFY_USER
            r1.mo90672m1(r2, r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.finder.service.p1 r0 = (com.tencent.p014mm.plugin.finder.service.C3605p1) r0
            te3.ii0 r1 = r4.field_extInfo
            if (r1 == 0) goto L_0x0274
            int r9 = r1.f135356g
        L_0x0274:
            r0.dp0(r9, r8, r6)
            goto L_0x02c4
        L_0x0278:
            java.lang.String r5 = "female"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0281
        L_0x0280:
            return
        L_0x0281:
            te3.ii0 r0 = r4.field_extInfo
            if (r0 == 0) goto L_0x028a
            r0.f135356g = r11
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x028b
        L_0x028a:
            r0 = r13
        L_0x028b:
            if (r0 != 0) goto L_0x0296
            te3.ii0 r0 = new te3.ii0
            r0.<init>()
            r4.field_extInfo = r0
            r0.f135356g = r11
        L_0x0296:
            fe1.d$b r0 = fe1.C58961d.f168673a
            r0.mo84166o(r4)
            r0 = r2 | 8
            bd1.c r2 = new bd1.c
            fe1.q r5 = r6.f17064j
            if (r5 == 0) goto L_0x02a5
            java.lang.String r13 = r5.field_username
        L_0x02a5:
            if (r13 != 0) goto L_0x02a8
            goto L_0x02a9
        L_0x02a8:
            r12 = r13
        L_0x02a9:
            r2.<init>(r12)
            r2.field_extFlag = r0
            bd1.i r0 = bd1.C39759i.MODIFY_USER
            r1.mo90672m1(r2, r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.finder.service.p1 r0 = (com.tencent.p014mm.plugin.finder.service.C3605p1) r0
            te3.ii0 r1 = r4.field_extInfo
            if (r1 == 0) goto L_0x02c0
            int r1 = r1.f135356g
            goto L_0x02c1
        L_0x02c0:
            r1 = 0
        L_0x02c1:
            r0.dp0(r1, r9, r6)
        L_0x02c4:
            r6.f17069r = r8
            com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI$c r0 = com.tencent.p014mm.plugin.finder.p056ui.FinderSettingDetailInfoUI.C3722c.f17076d
            o40.C61926c.m72668M(r0)
        L_0x02cb:
            r20.showProgress()
            goto L_0x0397
        L_0x02d0:
            java.lang.String r3 = r6.f17058d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "handleActivityResult by selectProfileCoverHelper: "
            r4.append(r8)
            r4.append(r0)
            r8 = 32
            r4.append(r8)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.finder.ui.n2 r3 = r6.f17067p
            if (r3 == 0) goto L_0x0397
            java.lang.String r4 = "Finder.SelectCoverHelper"
            switch(r0) {
                case 2000: goto L_0x0392;
                case 2001: goto L_0x037b;
                case 2002: goto L_0x032a;
                case 2003: goto L_0x02f9;
                default: goto L_0x02f7;
            }
        L_0x02f7:
            goto L_0x0397
        L_0x02f9:
            java.lang.Class<cw.g> r0 = p140cw.C7138g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            cw.g r0 = (p140cw.C7138g) r0
            com.tencent.mm.ui.MMActivity r1 = r3.f17410a
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r5 = f12.C7970a.m8127a()
            java.lang.String r0 = r0.mo8319g6(r1, r2, r5)
            if (r0 == 0) goto L_0x0397
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "REQUEST_CODE_CAPTURE_PROFILE_COVER_OLD: path:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r3.mo4204c(r0)
            goto L_0x0397
        L_0x032a:
            if (r2 == 0) goto L_0x0397
            if (r1 != r5) goto L_0x0397
            java.lang.String r0 = r2.getStringExtra(r7)
            r3.mo4205d()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0362
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 != 0) goto L_0x0342
            goto L_0x0362
        L_0x0342:
            cm1.j2 r14 = r3.f17412c
            if (r0 != 0) goto L_0x0347
            goto L_0x0348
        L_0x0347:
            r12 = r0
        L_0x0348:
            com.tencent.mm.plugin.finder.ui.i2 r1 = new com.tencent.mm.plugin.finder.ui.i2
            r1.<init>(r3, r0)
            r14.getClass()
            cm1.o2 r0 = new cm1.o2
            r0.<init>(r12, r14, r1, r13)
            r15 = 0
            r16 = 0
            r18 = 3
            r19 = 0
            r17 = r0
            bl3.C0317e.launch$default(r14, r15, r16, r17, r18, r19)
            goto L_0x0397
        L_0x0362:
            java.lang.String r0 = "no profile cover set"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            it1.b r0 = r3.f17411b
            if (r0 == 0) goto L_0x036e
            r0.mo8913b()
        L_0x036e:
            com.tencent.mm.ui.MMActivity r0 = r3.f17410a
            r1 = 2131830063(0x7f11252f, float:1.9293113E38)
            java.lang.String r1 = r3.mo4203b(r1)
            nj3.C76912y0.m92767f(r0, r1)
            goto L_0x0397
        L_0x037b:
            if (r2 == 0) goto L_0x0397
            if (r1 != r5) goto L_0x0397
            com.tencent.mm.ui.MMActivity r0 = r3.f17410a
            java.lang.String r1 = f12.C7970a.m8127a()
            java.lang.String r0 = com.tencent.p014mm.p136ui.tools.C7013o.m7260b(r0, r2, r1)
            java.lang.String r1 = "imgPath"
            gy3.C87412m.m108593f(r0, r1)
            r3.mo4204c(r0)
            goto L_0x0397
        L_0x0392:
            java.lang.String r0 = "REQUEST_CODE_CAPTURE_PROFILE_COVER return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x0397:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderSettingDetailInfoUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17063i = C66785b.f191882e.mo90662O5();
        String str = this.f17058d;
        Log.m105924i(str, "myFinderUser " + this.f17063i);
        setMMTitle((int) C0966R.string.eop);
        this.f17067p = new C3866n2(this);
        setBackBtn(new C3723d(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C3866n2 n2Var = this.f17067p;
        if (n2Var != null) {
            n2Var.f17412c.onCleared();
        }
        this.f17067p = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceTreeClick(pj3.C47511g r14, com.tencent.p014mm.p136ui.base.preference.Preference r15) {
        /*
            r13 = this;
            java.lang.Class<er1.b> r14 = er1.C58684b.class
            gy3.C87412m.m108591d(r15)
            java.lang.String r15 = r15.f121285r
            java.lang.String r0 = r13.f17058d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "click "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 1
            if (r15 == 0) goto L_0x029e
            int r1 = r15.hashCode()
            java.lang.String r2 = "unshow"
            r3 = 2
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            switch(r1) {
                case -1696877947: goto L_0x0266;
                case -1298291467: goto L_0x0244;
                case 281722780: goto L_0x0226;
                case 460789002: goto L_0x0119;
                case 534699594: goto L_0x00b6;
                case 679059498: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x029e
        L_0x0031:
            java.lang.String r14 = "settings_district"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x003c
            goto L_0x029e
        L_0x003c:
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            java.lang.String r15 = "GetAddress"
            r14.putExtra(r15, r0)
            java.lang.String r15 = "ShowSelectedLocation"
            r14.putExtra(r15, r0)
            java.lang.String r15 = "SetSelectLocation"
            r14.putExtra(r15, r0)
            zc1.b r15 = zc1.C66785b.f191882e
            fe1.q r1 = r13.f17064j
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = r1.field_username
            goto L_0x005a
        L_0x0059:
            r1 = r5
        L_0x005a:
            if (r1 != 0) goto L_0x005d
            r1 = r4
        L_0x005d:
            bd1.b r15 = zc1.C66783a.C66784a.m78798a(r15, r1, r6, r3, r5)
            if (r15 == 0) goto L_0x0065
            int r6 = r15.field_extFlag
        L_0x0065:
            r15 = r6 & 4
            java.lang.String r1 = "SelectedCountryCode"
            if (r15 != 0) goto L_0x006f
            r14.putExtra(r1, r2)
            goto L_0x007f
        L_0x006f:
            fe1.q r15 = r13.f17064j
            if (r15 == 0) goto L_0x007b
            te3.ii0 r15 = r15.field_extInfo
            if (r15 == 0) goto L_0x007b
            java.lang.String r15 = r15.f135353d
            if (r15 != 0) goto L_0x007c
        L_0x007b:
            r15 = r4
        L_0x007c:
            r14.putExtra(r1, r15)
        L_0x007f:
            fe1.q r15 = r13.f17064j
            if (r15 == 0) goto L_0x008b
            te3.ii0 r15 = r15.field_extInfo
            if (r15 == 0) goto L_0x008b
            java.lang.String r15 = r15.f135354e
            if (r15 != 0) goto L_0x008c
        L_0x008b:
            r15 = r4
        L_0x008c:
            java.lang.String r1 = "SelectedProvinceCode"
            r14.putExtra(r1, r15)
            fe1.q r15 = r13.f17064j
            if (r15 == 0) goto L_0x009f
            te3.ii0 r15 = r15.field_extInfo
            if (r15 == 0) goto L_0x009f
            java.lang.String r15 = r15.f135355f
            if (r15 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r4 = r15
        L_0x009f:
            java.lang.String r15 = "SelectedCityCode"
            r14.putExtra(r15, r4)
            java.lang.String r15 = "NeedUnshowItem"
            r14.putExtra(r15, r0)
            androidx.appcompat.app.AppCompatActivity r15 = r13.getContext()
            int r1 = r13.f17061g
            java.lang.String r2 = ".ui.tools.MultiStageCitySelectUI"
            ke3.C88144b.m109802t(r15, r2, r14, r1)
            goto L_0x029e
        L_0x00b6:
            java.lang.String r1 = "settings_sex"
            boolean r15 = r15.equals(r1)
            if (r15 != 0) goto L_0x00c1
            goto L_0x029e
        L_0x00c1:
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            zc1.b r1 = zc1.C66785b.f191882e
            fe1.q r7 = r13.f17064j
            if (r7 == 0) goto L_0x00cf
            java.lang.String r7 = r7.field_username
            goto L_0x00d0
        L_0x00cf:
            r7 = r5
        L_0x00d0:
            if (r7 != 0) goto L_0x00d3
            r7 = r4
        L_0x00d3:
            bd1.b r1 = zc1.C66783a.C66784a.m78798a(r1, r7, r6, r3, r5)
            if (r1 == 0) goto L_0x00dc
            int r1 = r1.field_extFlag
            goto L_0x00dd
        L_0x00dc:
            r1 = 0
        L_0x00dd:
            r1 = r1 & 8
            java.lang.String r5 = "key_input_sex"
            if (r1 <= 0) goto L_0x0101
            fe1.q r1 = r13.f17064j
            if (r1 == 0) goto L_0x00ed
            te3.ii0 r1 = r1.field_extInfo
            if (r1 == 0) goto L_0x00ed
            int r6 = r1.f135356g
        L_0x00ed:
            if (r6 == r0) goto L_0x00fb
            if (r6 == r3) goto L_0x00f5
            r15.putExtra(r5, r4)
            goto L_0x0104
        L_0x00f5:
            java.lang.String r1 = "female"
            r15.putExtra(r5, r1)
            goto L_0x0104
        L_0x00fb:
            java.lang.String r1 = "male"
            r15.putExtra(r5, r1)
            goto L_0x0104
        L_0x0101:
            r15.putExtra(r5, r2)
        L_0x0104:
            di3.d r14 = di3.C86312j.m106911c(r14)
            er1.b r14 = (er1.C58684b) r14
            int r1 = r13.f17062h
            r14.getClass()
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderSelectSexUI> r14 = com.tencent.p014mm.plugin.finder.p056ui.FinderSelectSexUI.class
            r15.setClass(r13, r14)
            r13.startActivityForResult((android.content.Intent) r15, (int) r1)
            goto L_0x029e
        L_0x0119:
            java.lang.String r14 = "settings_nickname"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x0124
            goto L_0x029e
        L_0x0124:
            te3.ke1 r14 = r13.f17065n
            if (r14 == 0) goto L_0x0221
            zc1.b r14 = zc1.C66785b.f191882e
            java.lang.String r15 = r13.f17063i
            if (r15 != 0) goto L_0x012f
            r15 = r4
        L_0x012f:
            bd1.b r14 = zc1.C66783a.C66784a.m78798a(r14, r15, r6, r3, r5)
            if (r14 == 0) goto L_0x013c
            te3.dr2 r14 = r14.mo75251m2()
            int r14 = r14.f132494e
            goto L_0x013d
        L_0x013c:
            r14 = 0
        L_0x013d:
            te3.ke1 r15 = r13.f17065n
            gy3.C87412m.m108591d(r15)
            java.util.LinkedList<te3.zg3> r15 = r15.f136709z
            if (r15 == 0) goto L_0x0170
            java.util.Iterator r15 = r15.iterator()
        L_0x014a:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0168
            java.lang.Object r1 = r15.next()
            r2 = r1
            te3.zg3 r2 = (te3.C52261zg3) r2
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f145918e
            if (r2 == 0) goto L_0x015e
            java.lang.String r2 = r2.username
            goto L_0x015f
        L_0x015e:
            r2 = r5
        L_0x015f:
            java.lang.String r7 = r13.f17063i
            boolean r2 = gy3.C87412m.m108589b(r2, r7)
            if (r2 == 0) goto L_0x014a
            goto L_0x0169
        L_0x0168:
            r1 = r5
        L_0x0169:
            te3.zg3 r1 = (te3.C52261zg3) r1
            if (r1 == 0) goto L_0x0170
            te3.le1 r15 = r1.f145917d
            goto L_0x0171
        L_0x0170:
            r15 = r5
        L_0x0171:
            java.lang.String r1 = r13.f17058d
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r2[r6] = r7
            java.lang.String r7 = "userFlag %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r2)
            zc1.b r1 = zc1.C66785b.f191882e
            bd1.b r2 = zc1.C66783a.C66784a.m78800c(r1, r6, r0, r5)
            if (r2 == 0) goto L_0x0194
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r2 = r2.field_authInfo
            if (r2 == 0) goto L_0x0194
            int r2 = r2.auth_verify_identity
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0195
        L_0x0194:
            r2 = r5
        L_0x0195:
            java.lang.String r7 = r13.f17058d
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r8[r6] = r2
            java.lang.String r6 = "auth_verify_identity %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r8)
            r14 = r14 & r3
            if (r14 == 0) goto L_0x01ce
            java.lang.Class<kr0.x0> r14 = kr0.C76630x0.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            r5 = r14
            kr0.x0 r5 = (kr0.C76630x0) r5
            if (r15 == 0) goto L_0x01b5
            java.lang.String r14 = r15.f137359g
            if (r14 != 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r7 = r14
            goto L_0x01b6
        L_0x01b5:
            r7 = r4
        L_0x01b6:
            r8 = 0
            r9 = 0
            r10 = 0
            if (r15 == 0) goto L_0x01c2
            java.lang.String r14 = r15.f137358f
            if (r14 != 0) goto L_0x01c0
            goto L_0x01c2
        L_0x01c0:
            r11 = r14
            goto L_0x01c3
        L_0x01c2:
            r11 = r4
        L_0x01c3:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r12 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r12.<init>()
            r6 = r13
            r5.Ko0(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x029e
        L_0x01ce:
            if (r2 != 0) goto L_0x01d1
            goto L_0x01dc
        L_0x01d1:
            int r14 = r2.intValue()
            if (r14 != r0) goto L_0x01dc
            m3906I7(r13)
            goto L_0x029e
        L_0x01dc:
            if (r2 != 0) goto L_0x01df
            goto L_0x01ed
        L_0x01df:
            int r14 = r2.intValue()
            if (r14 != r3) goto L_0x01ed
            r14 = 2131826038(0x7f111576, float:1.928495E38)
            m3907J7(r13, r14)
            goto L_0x029e
        L_0x01ed:
            r14 = 3
            if (r2 != 0) goto L_0x01f1
            goto L_0x021c
        L_0x01f1:
            int r15 = r2.intValue()
            if (r15 != r14) goto L_0x021c
            fe1.d$b r14 = fe1.C58961d.f168673a
            java.lang.String r15 = r1.mo90662O5()
            fe1.q r14 = r14.mo84155b(r15)
            r15 = 2131826015(0x7f11155f, float:1.9284902E38)
            if (r14 == 0) goto L_0x0215
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r14 = r14.field_authInfo
            int r14 = r14.authIconType
            if (r14 != r3) goto L_0x0210
            m3907J7(r13, r15)
            goto L_0x0213
        L_0x0210:
            m3906I7(r13)
        L_0x0213:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0215:
            if (r5 != 0) goto L_0x029e
            m3907J7(r13, r15)
            goto L_0x029e
        L_0x021c:
            m3906I7(r13)
            goto L_0x029e
        L_0x0221:
            r13.mo4109H7()
            goto L_0x029e
        L_0x0226:
            java.lang.String r1 = "settings_signature"
            boolean r15 = r15.equals(r1)
            if (r15 != 0) goto L_0x0230
            goto L_0x029e
        L_0x0230:
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            java.lang.String r1 = "key_scene"
            r15.putExtra(r1, r3)
            di3.d r14 = di3.C86312j.m106911c(r14)
            er1.b r14 = (er1.C58684b) r14
            r14.iy0(r13, r15)
            goto L_0x029e
        L_0x0244:
            java.lang.String r14 = "settings_avatar"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x024e
            goto L_0x029e
        L_0x024e:
            ot1.a r14 = ot1.C11767a.f34453a
            java.lang.String r15 = "personalInfo"
            boolean r14 = r14.mo11659a(r15)
            if (r14 != 0) goto L_0x029e
            java.lang.Class<cw.g> r14 = p140cw.C7138g.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            cw.g r14 = (p140cw.C7138g) r14
            int r15 = r13.f17059e
            r14.mo8316Ya(r13, r15)
            goto L_0x029e
        L_0x0266:
            java.lang.String r14 = "settings_profile_cover"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x0270
            goto L_0x029e
        L_0x0270:
            com.tencent.mm.plugin.finder.ui.n2 r14 = r13.f17067p
            if (r14 == 0) goto L_0x029e
            boolean r15 = r13.f17068q
            qo3.n r1 = new qo3.n
            com.tencent.mm.ui.MMActivity r2 = r14.f17410a
            r1.<init>((android.content.Context) r2, (int) r0, (boolean) r6)
            com.tencent.mm.ui.MMActivity r2 = r14.f17410a
            android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r2)
            r3 = 2131495541(0x7f0c0a75, float:1.8614622E38)
            android.view.View r2 = r2.inflate(r3, r5)
            r1.mo107569n(r2, r0)
            com.tencent.mm.plugin.finder.ui.j2 r2 = new com.tencent.mm.plugin.finder.ui.j2
            r2.<init>(r15)
            r1.f225771i = r2
            com.tencent.mm.plugin.finder.ui.k2 r15 = new com.tencent.mm.plugin.finder.ui.k2
            r15.<init>(r14)
            r1.f225782p = r15
            r1.mo107573q()
        L_0x029e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderSettingDetailInfoUI.onPreferenceTreeClick(pj3.g, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    public void onResume() {
        super.onResume();
        mo4109H7();
        mo4110K7();
    }

    public final void showProgress() {
        ProgressDialog progressDialog = this.f17066o;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f17066o = C76879j.m92723Q(this, "", getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null);
    }
}
