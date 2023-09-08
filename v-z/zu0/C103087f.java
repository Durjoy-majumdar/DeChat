package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;

/* renamed from: zu0.f */
public class C103087f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ d$$c f304162d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList f304163e;

    /* renamed from: f */
    public final /* synthetic */ C103085d f304164f;

    public C103087f(C103085d dVar, d$$c d__c, LinkedList linkedList) {
        this.f304164f = dVar;
        this.f304162d = d__c;
        this.f304163e = linkedList;
    }

    public void run() {
        d$$c d__c;
        Log.m105925i("MicroMsg.BackupCalculator", "run: isCalculatorCancel:%s callbackConvForChoose:%s", Boolean.valueOf(this.f304164f.f304151a), this.f304162d);
        if (!this.f304164f.f304151a && (d__c = this.f304162d) != null) {
            d__c.mo22649N1(this.f304163e);
        }
    }
}
