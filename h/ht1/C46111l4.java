package ht1;

import com.tencent.p014mm.sdk.storage.MStorage;
import ue1.C37429f0;

/* renamed from: ht1.l4 */
public interface C46111l4 {

    /* renamed from: ht1.l4$a */
    public enum C33059a {
        RECEIVE,
        GET_SESSION_ID,
        SELF_REPLY,
        FOR_TEST
    }

    /* renamed from: G2 */
    C37429f0 mo71553G2(String str);

    void add(MStorage.IOnStorageChange iOnStorageChange);

    void remove(MStorage.IOnStorageChange iOnStorageChange);
}
