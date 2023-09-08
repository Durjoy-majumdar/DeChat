package vf2;

import com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import te3.C50241lc0;

/* renamed from: vf2.d */
public class C52885d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f147687d;

    /* renamed from: e */
    public final /* synthetic */ FacingCreateChatRoomAllInOneUI f147688e;

    public C52885d(FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI, LinkedList linkedList) {
        this.f147688e = facingCreateChatRoomAllInOneUI;
        this.f147687d = linkedList;
    }

    public void run() {
        LinkedList<C50241lc0> linkedList = this.f147688e.f53239z;
        if (linkedList != null) {
            linkedList.clear();
        }
        HashMap<String, C50241lc0> hashMap = this.f147688e.f53238y;
        if (hashMap != null) {
            hashMap.clear();
        }
        LinkedList linkedList2 = this.f147687d;
        if (linkedList2 != null && linkedList2.size() > 0) {
            int size = this.f147687d.size();
            for (int i = 0; i < size; i++) {
                C50241lc0 lc02 = (C50241lc0) this.f147687d.get(i);
                if (!Util.isNullOrNil(lc02.f137293e)) {
                    this.f147688e.f53238y.put(lc02.f137293e, lc02);
                }
            }
        }
        int size2 = this.f147688e.f53236x.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C50241lc0 lc03 = this.f147688e.f53236x.get(i2);
            if (!this.f147688e.f53238y.containsKey(lc03.f137293e)) {
                Log.m105919d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[updateMember] delete member name:%s", lc03.f137293e + "");
            } else {
                this.f147688e.f53238y.remove(lc03.f137293e);
            }
        }
        HashMap<String, C50241lc0> hashMap2 = this.f147688e.f53238y;
        if (hashMap2 != null && hashMap2.size() > 0) {
            for (Map.Entry<String, C50241lc0> value : this.f147688e.f53238y.entrySet()) {
                C50241lc0 lc04 = (C50241lc0) value.getValue();
                this.f147688e.f53239z.add(lc04);
                Log.m105919d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[updateMember] add member name:%s", lc04.f137293e + "");
            }
        }
        FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f147688e;
        facingCreateChatRoomAllInOneUI.f53236x.addAll(facingCreateChatRoomAllInOneUI.f53239z);
        this.f147688e.f53207P.sendEmptyMessage(10001);
    }
}
