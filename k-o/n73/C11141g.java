package n73;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;

/* renamed from: n73.g */
public class C11141g extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11016);
        arrayList.add(11017);
        arrayList.add(11018);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        String str;
        int i2 = i;
        try {
            str = new String(bArr, "utf8");
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.Wear.HttpFriendServer", "error to get username");
            return null;
        }
        Log.m105925i("MicroMsg.Wear.HttpFriendServer", "handle friend request %s", str);
        if (i2 == 11016) {
            Intent intent = new Intent();
            String packageName = MMApplicationContext.getPackageName();
            intent.setClassName(packageName, MMApplicationContext.getSourcePackageName() + "." + "plugin." + "subapp" + ".ui.friend.FMessageTransferUI");
            intent.putExtra("friend_message_transfer_username", str);
            StringBuilder sb = new StringBuilder();
            sb.append("friend_message_accept_");
            sb.append(str);
            intent.setAction(sb.toString());
            intent.setFlags(335544320);
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/wear/model/server/HttpFriendServer", "handleData", "(I[B)[B", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/wear/model/server/HttpFriendServer", "handleData", "(I[B)[B", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i2 == 11017) {
            Intent intent2 = new Intent();
            String packageName2 = MMApplicationContext.getPackageName();
            intent2.setClassName(packageName2, MMApplicationContext.getSourcePackageName() + "." + "plugin." + "subapp" + ".ui.friend.FMessageTransferUI");
            intent2.putExtra("friend_message_transfer_username", str);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("friend_message_ignore_");
            sb4.append(str);
            intent2.setAction(sb4.toString());
            intent2.setFlags(335544320);
            Context context3 = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            Context context4 = context3;
            C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/plugin/wear/model/server/HttpFriendServer", "handleData", "(I[B)[B", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context4, "com/tencent/mm/plugin/wear/model/server/HttpFriendServer", "handleData", "(I[B)[B", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i2 == 11018) {
            Intent intent3 = new Intent();
            String packageName3 = MMApplicationContext.getPackageName();
            intent3.setClassName(packageName3, MMApplicationContext.getSourcePackageName() + "." + "plugin." + "subapp" + ".ui.friend.FMessageConversationUI");
            intent3.setFlags(335544320);
            Context context5 = MMApplicationContext.getContext();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent3);
            Context context6 = context5;
            C117292a.m165358d(context6, aVar3.mo10232b(), "com/tencent/mm/plugin/wear/model/server/HttpFriendServer", "handleData", "(I[B)[B", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context5.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context6, "com/tencent/mm/plugin/wear/model/server/HttpFriendServer", "handleData", "(I[B)[B", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return null;
    }
}
