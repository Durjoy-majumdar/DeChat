package t61;

import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.emoji.model.C41045h;
import com.tencent.p014mm.plugin.emoji.model.C41050j;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiSortUI;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreDetailUI;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import sx3.C36907w;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: t61.e */
public final class C101729e implements C101738m {

    /* renamed from: a */
    public final Context f297803a;

    /* renamed from: b */
    public final int f297804b;

    /* renamed from: c */
    public final int f297805c;

    public C101729e(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        this.f297803a = context;
        this.f297804b = i;
        this.f297805c = i2;
    }

    /* renamed from: a */
    public void mo141167a(C101728d dVar, int i) {
        C87412m.m108594g(dVar, "item");
        if (dVar instanceof C101731g) {
            int i2 = EmojiSortUI.f268549f;
            Context context = this.f297803a;
            String str = ((C101731g) dVar).f297807a.field_key;
            C87412m.m108593f(str, "item.info.field_key");
            C87412m.m108594g(context, "context");
            Intent intent = new Intent(context, EmojiSortUI.class);
            intent.putExtra("type", "type_list_ip_set");
            intent.putExtra("ip_set_key", str);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpList", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpList", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (dVar instanceof C101730f) {
            Intent intent2 = new Intent();
            intent2.setClass(this.f297803a, EmojiStoreDetailUI.class);
            EmojiGroupInfo emojiGroupInfo = ((C101730f) dVar).f297806a;
            intent2.putExtra("extra_id", emojiGroupInfo.field_productID);
            intent2.putExtra("extra_name", emojiGroupInfo.field_packName);
            intent2.putExtra("extra_copyright", emojiGroupInfo.field_packCopyright);
            intent2.putExtra("extra_coverurl", emojiGroupInfo.field_packCoverUrl);
            intent2.putExtra("extra_description", emojiGroupInfo.field_packDesc);
            intent2.putExtra("extra_price", emojiGroupInfo.field_packPrice);
            intent2.putExtra("extra_type", emojiGroupInfo.field_packType);
            intent2.putExtra("extra_flag", emojiGroupInfo.field_packFlag);
            intent2.putExtra("preceding_scence", this.f297805c);
            intent2.putExtra("call_by", 1);
            intent2.putExtra("check_clickflag", false);
            intent2.putExtra("download_entrance_scene", this.f297804b);
            Context context3 = this.f297803a;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            Context context4 = context3;
            C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemClickListener", "onItemClick", "(Lcom/tencent/mm/plugin/emoji/ui/widget/EmojiMineItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context4, "com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemClickListener", "onItemClick", "(Lcom/tencent/mm/plugin/emoji/ui/widget/EmojiMineItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: b */
    public void mo141168b(C101728d dVar, int i) {
        C87412m.m108594g(dVar, "item");
        LinkedList linkedList = new LinkedList();
        if (dVar instanceof C101731g) {
            LinkedList<EmojiGroupInfo> linkedList2 = ((C101731g) dVar).f297808b;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
            for (EmojiGroupInfo emojiGroupInfo : linkedList2) {
                arrayList.add(emojiGroupInfo.field_productID);
            }
            linkedList.addAll(arrayList);
        } else if (dVar instanceof C101730f) {
            linkedList.add(((C101730f) dVar).f297806a.field_productID);
        }
        C41045h hVar = new C41045h(this.f297803a, linkedList);
        C53895h.m60466d(hVar.f110516d, (C66212f) null, (C53934p0) null, new C41050j(hVar, (C15601d<? super C41050j>) null), 3, (Object) null);
    }
}
