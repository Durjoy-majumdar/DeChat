package p195li;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.chatroom.p015ui.SeeRoomManagerUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7240a;
import d62.C7241k;
import di3.C86312j;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.Map;
import k20.C9556a;
import p629ny.C76979h;
import wd3.C53155r0;

/* renamed from: li.a */
public class C10529a implements C7241k.C7244c {

    /* renamed from: li.a$a */
    public class C10530a extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ WeakReference f31796e;

        /* renamed from: f */
        public final /* synthetic */ Bundle f31797f;

        /* renamed from: g */
        public final /* synthetic */ Map f31798g;

        /* renamed from: h */
        public final /* synthetic */ WeakReference f31799h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10530a(C10529a aVar, int i, C53155r0 r0Var, WeakReference weakReference, Bundle bundle, Map map, WeakReference weakReference2) {
            super(i, r0Var);
            this.f31796e = weakReference;
            this.f31797f = bundle;
            this.f31798g = map;
            this.f31799h = weakReference2;
        }

        /* renamed from: a */
        public void mo1118a(View view) {
            WeakReference weakReference = this.f31796e;
            if (weakReference != null && weakReference.get() != null) {
                String string = this.f31797f.getString("conv_talker_username");
                Context context = (Context) this.f31796e.get();
                Intent intent = new Intent(context, SeeRoomManagerUI.class);
                intent.setFlags(32768);
                intent.putExtra("RoomInfo_Id", string);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/chatroom/manager/ChatroomNewXmlMgr$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/chatroom/manager/ChatroomNewXmlMgr$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                ((C7241k) C86312j.m106911c(C7241k.class)).h80("link_admin_explain", this.f31798g, this.f31797f, this.f31796e, this.f31799h);
            }
        }
    }

    /* renamed from: G4 */
    public CharSequence mo8417G4(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        String str2 = str;
        sb.append(str);
        sb.append(".title");
        Map<String, String> map2 = map;
        String str3 = map.get(sb.toString());
        if (Util.isNullOrNil(str3)) {
            return "";
        }
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str3);
        T1.setSpan(new C10530a(this, 1, (C53155r0) null, weakReference, bundle, map, weakReference2), 0, str3.length(), 33);
        spannableStringBuilder.append(T1);
        return spannableStringBuilder;
    }
}
