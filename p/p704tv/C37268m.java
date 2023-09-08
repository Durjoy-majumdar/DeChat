package p704tv;

import com.tencent.p014mm.autogen.events.OpenImUrlNotifyEvent;
import je0.C33549q;
import ob0.C117747y;
import ob0.C35142u;

/* renamed from: tv.m */
public class C37268m implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C33549q) {
            OpenImUrlNotifyEvent openImUrlNotifyEvent = new OpenImUrlNotifyEvent();
            openImUrlNotifyEvent.f78890d.f78891a = ((C33549q) yVar).f90833f;
            openImUrlNotifyEvent.publish();
        }
    }
}
