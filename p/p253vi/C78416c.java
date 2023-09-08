package p253vi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import qo3.C77407n;

/* renamed from: vi.c */
public class C78416c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f229759d;

    /* renamed from: e */
    public final /* synthetic */ Context f229760e;

    /* renamed from: f */
    public final /* synthetic */ String f229761f;

    public C78416c(C77407n nVar, Context context, String str) {
        this.f229759d = nVar;
        this.f229760e = context;
        this.f229761f = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/util/ConvBoxTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f229759d.mo107572p();
        Intent intent = new Intent();
        intent.setClassName(this.f229760e, "com.tencent.mm.ui.LauncherUI");
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        if (defaultPreference != null) {
            defaultPreference.edit().putBoolean("conversation_box_tip", true).apply();
        }
        intent.setFlags(67108864);
        Context context = this.f229760e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/chatroom/util/ConvBoxTip$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/chatroom/util/ConvBoxTip$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ChatBoxGroupActionStruct chatBoxGroupActionStruct = new ChatBoxGroupActionStruct();
        chatBoxGroupActionStruct.f194151d = chatBoxGroupActionStruct.mo86045b("roomUsername", this.f229761f, true);
        chatBoxGroupActionStruct.f194152e = 3;
        chatBoxGroupActionStruct.mo86054n();
        C117292a.m165361g(this, "com/tencent/mm/chatroom/util/ConvBoxTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
