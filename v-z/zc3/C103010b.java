package zc3;

import android.content.Context;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import java.util.List;
import wh3.C102452z;

/* renamed from: zc3.b */
public interface C103010b {
    /* renamed from: H2 */
    EmojiInfo mo138001H2(String str);

    /* renamed from: N1 */
    boolean mo138007N1(String str);

    /* renamed from: T */
    String mo138012T(String str);

    /* renamed from: Y0 */
    boolean mo138013Y0();

    /* renamed from: a */
    void mo138014a();

    /* renamed from: b */
    String mo138015b();

    /* renamed from: c */
    void mo138016c(MStorage.IOnStorageChange iOnStorageChange);

    /* renamed from: d */
    boolean mo138017d();

    /* renamed from: e */
    List<C102452z> mo138018e();

    /* renamed from: f */
    void mo138019f(EmojiInfo emojiInfo);

    /* renamed from: g */
    boolean mo138020g();

    /* renamed from: h */
    boolean mo138021h(Context context, EmojiInfo emojiInfo, int i, int i2, boolean z, boolean z2, String str, ArrayList<String> arrayList, String str2);

    /* renamed from: i */
    void mo138022i(MStorage.IOnStorageChange iOnStorageChange);

    /* renamed from: j */
    void mo138023j(String str);

    /* renamed from: k */
    void mo138024k(MStorage.IOnStorageChange iOnStorageChange);

    /* renamed from: l */
    void mo138025l(MStorage.IOnStorageChange iOnStorageChange);

    /* renamed from: l1 */
    boolean mo138026l1(String str);

    /* renamed from: m */
    EmojiInfo mo138027m(EmojiInfo emojiInfo);

    /* renamed from: n */
    void mo138028n(String str);

    /* renamed from: o */
    void mo138029o(EmojiInfo emojiInfo);

    void onDestroy();

    /* renamed from: p */
    EmojiIPSetInfo mo138031p(String str);

    /* renamed from: q */
    <T> T mo138032q(C72994y1.C72995a aVar, T t);

    /* renamed from: r */
    EmojiInfo mo138033r(String str, int i, int i2, int i3);

    /* renamed from: s */
    void mo138034s(C72994y1.C72995a aVar, Object obj);

    /* renamed from: t */
    boolean mo138035t();

    /* renamed from: u */
    byte[] mo138036u(EmojiInfo emojiInfo);

    /* renamed from: v */
    String mo138037v();
}
