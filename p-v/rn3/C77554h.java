package rn3;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.transmit.MMCreateChatroomUI;
import java.util.LinkedList;

/* renamed from: rn3.h */
public class C77554h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f226105d;

    /* renamed from: e */
    public final /* synthetic */ MMCreateChatroomUI f226106e;

    public C77554h(MMCreateChatroomUI mMCreateChatroomUI, LinkedList linkedList) {
        this.f226106e = mMCreateChatroomUI;
        this.f226105d = linkedList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MMCreateChatroomUI.m89639i8(this.f226106e, this.f226105d);
    }
}
