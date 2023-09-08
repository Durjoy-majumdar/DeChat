package po1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C56630k;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import er1.C7888v2;
import f40.C86709a0;
import fe1.C58960c;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import l60.C99344b;
import o40.C61926c;
import org.json.JSONObject;
import p1081gi.C98121d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62372x;
import qy2.C77455o;
import qy2.C77459z;
import r60.C101350i;
import t60.C64207e;
import te3.C64689rq2;
import up1.C27696y;
import uz2.C65488a0;
import x60.C102564a;

/* renamed from: po1.b */
public class C62415b extends C77455o {

    /* renamed from: d */
    public final String f177383d;

    /* renamed from: e */
    public FinderObject f177384e;

    /* renamed from: po1.b$a */
    public static final class C62416a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ ImageView f177385a;

        public C62416a(ImageView imageView) {
            this.f177385a = imageView;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            ImageView imageView = this.f177385a;
            imageView.post(new C62413a((Bitmap) obj, imageView));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62415b(String str, String str2) {
        super(str);
        C87412m.m108594g(str2, "TAG");
        this.f177383d = str2;
    }

    /* renamed from: a */
    public C77459z mo87467a() {
        FinderObject finderObject = this.f177384e;
        String str = null;
        if (finderObject == null) {
            return null;
        }
        FinderContact finderContact = finderObject.contact;
        C58969q f = finderContact != null ? C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null) : null;
        C7888v2.C7889a aVar = C7888v2.f26513a;
        String nickname = f != null ? f.getNickname() : null;
        if (f != null) {
            str = f.getAvatarUrl();
        }
        return aVar.mo9009g(nickname, str, finderObject.f164794id, finderObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r3 = r3.contact;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo84141b(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r8, r1)
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r7.f177384e
            r2 = 0
            if (r1 == 0) goto L_0x0073
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r7.f177384e
            r4 = 0
            if (r3 == 0) goto L_0x001d
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.contact
            if (r3 == 0) goto L_0x001d
            java.lang.String r3 = r3.username
            goto L_0x001e
        L_0x001d:
            r3 = r4
        L_0x001e:
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r5 = r5.mo90662O5()
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r7.f177384e
            if (r5 == 0) goto L_0x0032
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.contact
            if (r5 == 0) goto L_0x0032
            java.lang.String r4 = r5.username
        L_0x0032:
            java.lang.String r5 = "finder_username"
            r1.putExtra(r5, r4)
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r7.f177384e
            if (r4 == 0) goto L_0x0049
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.contact
            if (r4 == 0) goto L_0x0049
            te3.cg r4 = fe1.C58960c.m68829a(r4, r2)
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = r4.f182468d
            if (r4 != 0) goto L_0x004b
        L_0x0049:
            java.lang.String r4 = ""
        L_0x004b:
            java.lang.String r5 = "key_biz_username"
            r1.putExtra(r5, r4)
            r4 = 2
            r5 = 20
            if (r3 == 0) goto L_0x005f
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r0.mo76836bn(r8, r1, r5, r4)
            goto L_0x0073
        L_0x005f:
            di3.d r3 = di3.C86312j.m106911c(r0)
            ht1.t1 r3 = (ht1.C60200t1) r3
            r6 = 32
            r3.mo76842e7(r5, r4, r6, r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r0.mo76819V1(r8, r1)
        L_0x0073:
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r7.f177384e
            if (r8 == 0) goto L_0x0078
            r2 = 1
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: po1.C62415b.mo84141b(android.content.Context):boolean");
    }

    /* renamed from: d */
    public boolean mo84142d(Context context, Bundle bundle) {
        Class cls = C60200t1.class;
        Log.m105924i(this.f177383d, "[doJump]");
        FinderObject finderObject = new FinderObject();
        C65488a0 a0Var = this.f225886b;
        if (a0Var == null || !C87412m.m108589b(a0Var.f188439d, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
            return false;
        }
        finderObject.parseFrom(Base64.decode(a0Var.f188441f, 0));
        Intent intent = new Intent();
        intent.putExtra("feed_object_id", finderObject.f164794id);
        intent.putExtra("feed_object_nonceId", finderObject.objectNonceId);
        intent.putExtra("key_need_related_list", false);
        C7888v2.C7889a aVar = C7888v2.f26513a;
        C68070l.C68072b f = aVar.mo9008f(aVar.mo9010h(FinderItem.Companion.mo79056a(finderObject, 0), false));
        String str = null;
        intent.putExtra("KEY_AUTHORIZATION_CONTENT", C68070l.C68072b.m80420s(f, (String) null, (C98121d) null));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("feedId", C61926c.m72691p(finderObject.f164794id));
        FinderContact finderContact = finderObject.contact;
        if (finderContact != null) {
            str = finderContact.username;
        }
        jSONObject.put("finderusername", str);
        intent.putExtra("key_extra_info", jSONObject.toString());
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(20, 2, 25, intent);
        C87412m.m108591d(context);
        ((C60200t1) C86312j.m106911c(cls)).mo76864nr(context, intent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r0 = (r0 = r4.f177384e).contact;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo84143f() {
        /*
            r4 = this;
            boolean r0 = r4.mo87469l()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r4.f177384e
            if (r0 == 0) goto L_0x001c
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.contact
            if (r0 == 0) goto L_0x001c
            r1 = 0
            r2 = 3
            r3 = 0
            fe1.q r0 = fe1.C58960c.m68834f(r0, r3, r1, r2, r3)
            java.lang.String r1 = r0.getNickname()
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: po1.C62415b.mo84143f():java.lang.CharSequence");
    }

    /* renamed from: h */
    public String mo84144h() {
        FinderObject finderObject = this.f177384e;
        String unsignedLongString = Util.getUnsignedLongString(finderObject != null ? finderObject.f164794id : 0);
        C87412m.m108593f(unsignedLongString, "getUnsignedLongString(finderObject?.id ?: 0)");
        return unsignedLongString;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r0 = r0.objectDesc;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo84145i() {
        /*
            r2 = this;
            boolean r0 = r2.mo87469l()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r2.f177384e
            if (r0 == 0) goto L_0x0014
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.description
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: po1.C62415b.mo84145i():java.lang.CharSequence");
    }

    /* renamed from: j */
    public boolean mo84146j() {
        return true;
    }

    /* renamed from: k */
    public boolean mo87468k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo87469l() {
        HashMap<Long, Boolean> hashMap = C56630k.f162343n;
        FinderObject finderObject = this.f177384e;
        Boolean bool = C56630k.f162343n.get(Long.valueOf(finderObject != null ? finderObject.f164794id : 0));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: m */
    public void mo84147m(String str, C65488a0 a0Var) {
        this.f225886b = a0Var;
        this.f225887c = str;
        if (a0Var != null && C87412m.m108589b(a0Var.f188439d, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
            byte[] decode = Base64.decode(a0Var.f188441f, 0);
            FinderObject finderObject = new FinderObject();
            this.f177384e = finderObject;
            finderObject.parseFrom(decode);
        }
    }

    /* renamed from: n */
    public void mo84148n() {
    }

    /* renamed from: o */
    public boolean mo84149o(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "container");
        frameLayout.removeAllViews();
        if (!mo87469l()) {
            return false;
        }
        ImageView imageView = (ImageView) frameLayout.findViewWithTag(this.f177383d);
        if (imageView == null) {
            imageView = new ImageView(frameLayout.getContext());
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(imageView);
        mo87470r(imageView);
        return true;
    }

    /* renamed from: p */
    public boolean mo84851p(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "container");
        ImageView imageView = (ImageView) frameLayout.findViewWithTag(this.f177383d);
        if (imageView == null) {
            imageView = new ImageView(frameLayout.getContext());
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.removeAllViews();
        frameLayout.addView(imageView);
        mo87470r(imageView);
        return true;
    }

    /* renamed from: q */
    public boolean mo84150q(FrameLayout frameLayout) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(frameLayout, "container");
        boolean z = false;
        if (!mo87469l()) {
            View findViewWithTag = frameLayout.findViewWithTag("Finder.TextStatusProvider.invalidView");
            if (findViewWithTag == null) {
                findViewWithTag = C85868k2.m106137b(frameLayout.getContext()).inflate(C0966R.C0971layout.aqa, frameLayout, false);
                C87412m.m108593f(findViewWithTag, "getInflater(container.co…d_view, container, false)");
                findViewWithTag.setTag("Finder.TextStatusProvider.invalidView");
                frameLayout.removeAllViews();
                frameLayout.addView(findViewWithTag);
            }
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, "");
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            String str = (String) f;
            if (!(str.length() == 0)) {
                String str2 = this.f177383d;
                Log.m105924i(str2, "[checkShowValidLayout] wording=" + str);
                TextView textView = (TextView) findViewWithTag.findViewById(C0966R.C0970id.f8o);
                if (textView != null) {
                    textView.setText(str);
                }
            }
            View findViewById = findViewWithTag.findViewById(C0966R.C0970id.f8m);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = findViewWithTag.findViewById(C0966R.C0970id.f8n);
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById3 = findViewWithTag.findViewById(C0966R.C0970id.ew9);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            FinderObject finderObject = this.f177384e;
            if (finderObject != null) {
                ImageView imageView = (ImageView) frameLayout.findViewWithTag(this.f177383d);
                if (imageView == null) {
                    imageView = new ImageView(frameLayout.getContext());
                    imageView.setTag(this.f177383d);
                    frameLayout.removeAllViews();
                    frameLayout.addView(imageView);
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                FinderItem a = FinderItem.Companion.mo79056a(finderObject, finderObject.objectType);
                FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
                if (finderObjectDesc != null && finderObjectDesc.mediaType == 2) {
                    z = true;
                }
                C27696y yVar = z ? C27696y.RAW_IMAGE : C27696y.THUMB_IMAGE;
                C39818r rVar = C39818r.f106831a;
                C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                C64689rq2 first = a.getMediaList().getFirst();
                C87412m.m108593f(first, "finderItem.mediaList.first");
                C99344b<C100810g0, Bitmap> b = f2.mo85956b(new C62372x(first, yVar, (String) null, 4, (C8480h) null), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
                C62416a aVar4 = new C62416a(imageView);
                b.getClass();
                b.f291320d = aVar4;
                b.mo85953c();
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r2.contact;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87470r(android.widget.ImageView r8) {
        /*
            r7 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r7.f177384e
            r3 = 0
            if (r2 == 0) goto L_0x0018
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.contact
            if (r2 == 0) goto L_0x0018
            r4 = 0
            r5 = 3
            fe1.q r2 = fe1.C58960c.m68834f(r2, r3, r4, r5, r3)
            java.lang.String r2 = r2.getAvatarUrl()
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r4 = r4.mo62446e(r1)
            bl3.c r4 = r4.mo62447c(r0)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11872i2()
            pl1.f r5 = new pl1.f
            r6 = 2
            r5.<init>(r2, r3, r6, r3)
            pl1.e0$a r2 = pl1.C11978e0.C11979a.AVATAR
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r1 = r3.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r2)
            r4.mo85957c(r5, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: po1.C62415b.mo87470r(android.widget.ImageView):void");
    }
}
