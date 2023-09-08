package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kotlin.Metadata;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import up1.C27696y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI */
public final class FinderWxProfileShowUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI$a */
    public static final class C3086a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderWxProfileShowUI f14923d;

        public C3086a(FinderWxProfileShowUI finderWxProfileShowUI) {
            this.f14923d = finderWxProfileShowUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14923d.setResult(-1);
            this.f14923d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI$b */
    public static final class C3087b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderWxProfileShowUI f14924d;

        public C3087b(FinderWxProfileShowUI finderWxProfileShowUI) {
            this.f14924d = finderWxProfileShowUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f14924d.setResult(-1);
            this.f14924d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d3z;
    }

    public void onCreate(Bundle bundle) {
        int i;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        super.onCreate(bundle);
        setBackBtn(new C3086a(this), C0966R.raw.icons_filled_close);
        String str = "";
        setMMTitle(str);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        TextView textView = (TextView) findViewById(C0966R.C0970id.nto);
        C85875k4.m106191k0(textView.getPaint());
        textView.setOnClickListener(new C3087b(this));
        String stringExtra = getIntent().getStringExtra("SWITCH_TO_USERNAME");
        if (stringExtra == null) {
            stringExtra = str;
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("Contact_Finder_Buffer");
        Log.m105924i("FinderWxProfileShowUI", "username:" + stringExtra + ", contactBuffer:" + byteArrayExtra);
        String string = getResources().getString(C0966R.string.n1g, new Object[]{stringExtra});
        C87412m.m108593f(string, "resources.getString(com.…ount_done_hint, username)");
        ((TextView) findViewById(C0966R.C0970id.ntn)).setText(string);
        View findViewById = findViewById(C0966R.C0970id.ntm);
        if (byteArrayExtra != null) {
            FinderContact finderContact = new FinderContact();
            finderContact.parseFrom(byteArrayExtra);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.nt_);
            C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar = new C62345f(finderContact.headUrl, (C27696y) null, 2, (C8480h) null);
            C87412m.m108593f(imageView, LocaleUtil.ITALIAN);
            i2.mo85957c(fVar, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            String str2 = finderContact.nickname;
            if (str2 != null) {
                str = str2;
            }
            ((TextView) findViewById(C0966R.C0970id.ntf)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, str));
            i = 0;
        } else {
            i = 4;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
