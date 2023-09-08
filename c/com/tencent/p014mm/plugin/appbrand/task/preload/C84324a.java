package com.tencent.p014mm.plugin.appbrand.task.preload;

import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81314c;
import com.tencent.p014mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.task.preload.a */
public class C84324a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandBatchPreloadController.TaskParamsCallPredownload f246210d;

    public C84324a(AppBrandBatchPreloadController.C84323f fVar, AppBrandBatchPreloadController.TaskParamsCallPredownload taskParamsCallPredownload) {
        this.f246210d = taskParamsCallPredownload;
    }

    public void run() {
        AppBrandBatchPreloadController.TaskParamsCallPredownload taskParamsCallPredownload = this.f246210d;
        AppBrandBatchPreloadController.TaskParamsCallPredownload taskParamsCallPredownload2 = this.f246210d;
        Log.m105919d("MicroMsg.Predownload.AppBrandBatchPreloadController", "TaskCallPredownload path:%s,scene:%d,appid:%s,appType:%d,dealPluginOnly:%b", taskParamsCallPredownload.f246204e, Integer.valueOf(taskParamsCallPredownload.f246205f), taskParamsCallPredownload2.f246203d, Integer.valueOf(taskParamsCallPredownload2.f246207h), Boolean.valueOf(this.f246210d.f246206g));
        AppBrandBatchPreloadController.TaskParamsCallPredownload taskParamsCallPredownload3 = this.f246210d;
        C81314c cVar = new C81314c((String) null, taskParamsCallPredownload3.f246203d, taskParamsCallPredownload3.f246204e, taskParamsCallPredownload3.f246205f, taskParamsCallPredownload3.f246208i);
        AppBrandBatchPreloadController.TaskParamsCallPredownload taskParamsCallPredownload4 = this.f246210d;
        cVar.f238757s = taskParamsCallPredownload4.f246207h;
        cVar.mo113598k(taskParamsCallPredownload4.f246206g);
    }
}
