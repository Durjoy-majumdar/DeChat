package p927ab;

import com.tencent.p014mm.sdk.platformtools.Log;
import p1019p6.C89314a;

/* renamed from: ab.c */
public class C79478c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f233029d;

    /* renamed from: e */
    public final /* synthetic */ C89314a f233030e;

    /* renamed from: f */
    public final /* synthetic */ C79479d f233031f;

    public C79478c(C79479d dVar, String str, C89314a aVar) {
        this.f233031f = dVar;
        this.f233029d = str;
        this.f233030e = aVar;
    }

    public void run() {
        synchronized (this.f233031f.f233036e) {
            C79479d dVar = this.f233031f;
            if (dVar.f233037f && !dVar.f233036e.contains(this.f233029d) && this.f233030e != null) {
                C79479d dVar2 = this.f233031f;
                if (dVar2.f233038g != 0) {
                    int size = dVar2.f233036e.size();
                    C79479d dVar3 = this.f233031f;
                    if (size < dVar3.f233038g) {
                        C79479d dVar4 = this.f233031f;
                        this.f233030e.getClass();
                        this.f233030e.getClass();
                        Log.m105919d("MicroMsg.MBImageDecodeRegistry", "reportDecodeInfo mMaxSampleNum report size:%d, getSourceType:%s,appId:%s,mAppType:%d,getSize:%d,getWidth:%d,getHeight:%d", Integer.valueOf(dVar3.f233036e.size()), this.f233030e.f257271e, dVar4.f233035d, Integer.valueOf(dVar4.f233040i), Long.valueOf(this.f233030e.f257267a), -1L, -1L);
                        C79479d.m96442c(this.f233031f, this.f233029d, this.f233030e);
                    }
                } else {
                    double random = Math.random();
                    C79479d dVar5 = this.f233031f;
                    if (random < dVar5.f233039h) {
                        C79479d dVar6 = this.f233031f;
                        this.f233030e.getClass();
                        this.f233030e.getClass();
                        Log.m105919d("MicroMsg.MBImageDecodeRegistry", "reportDecodeInfo mSampleRate report size:%d, getSourceType:%s,appId:%s,mAppType:%d,getSize:%d,getWidth:%d,getHeight:%d", Integer.valueOf(dVar5.f233036e.size()), this.f233030e.f257271e, dVar6.f233035d, Integer.valueOf(dVar6.f233040i), Long.valueOf(this.f233030e.f257267a), -1L, -1L);
                        C79479d.m96442c(this.f233031f, this.f233029d, this.f233030e);
                    }
                }
            }
        }
    }
}
