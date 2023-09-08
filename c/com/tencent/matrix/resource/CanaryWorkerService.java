package com.tencent.matrix.resource;

import android.content.Intent;
import android.os.Build;
import android.os.Process;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import p296bf.C79696c;
import p334ef.C20587a;
import p425ze.C91671f;
import p723vf.C118672d;
import p761yd.C91441c;

public class CanaryWorkerService extends MatrixJobIntentService {

    /* renamed from: n */
    public static final /* synthetic */ int f235510n = 0;

    /* renamed from: d */
    public void mo112066d(Intent intent) {
        if (intent != null && "com.tencent.matrix.resource.worker.action.SHRINK_HPROF".equals(intent.getAction())) {
            try {
                intent.setExtrasClassLoader(getClassLoader());
                C91671f fVar = (C91671f) intent.getSerializableExtra("com.tencent.matrix.resource.worker.param.HEAPDUMP");
                if (fVar != null) {
                    mo112067f(fVar);
                } else {
                    C118672d.m167352b("Matrix.CanaryWorkerService", "failed to deserialize heap dump, give up shrinking and reporting.", new Object[0]);
                }
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.CanaryWorkerService", th, "failed to deserialize heap dump, give up shrinking and reporting.", new Object[0]);
            }
        }
    }

    /* renamed from: f */
    public final void mo112067f(C91671f fVar) {
        C91671f fVar2 = fVar;
        File parentFile = fVar2.f262651d.getParentFile();
        String name = fVar2.f262651d.getName();
        File file = new File(parentFile, name.substring(0, name.indexOf(".hprof")) + "_shrink.hprof");
        File file2 = new File(parentFile, ("dump_result_" + Process.myPid()) + '_' + new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH).format(new Date()) + ".zip");
        File file3 = fVar2.f262651d;
        ZipOutputStream zipOutputStream = null;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            new C20587a().mo32235a(file3, file);
            C118672d.m167353c("Matrix.CanaryWorkerService", "shrink hprof file %s, size: %dk to %s, size: %dk, use time:%d", file3.getPath(), Long.valueOf(file3.length() / 1024), file.getPath(), Long.valueOf(file.length() / 1024), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
            try {
                ZipEntry zipEntry = new ZipEntry("result.info");
                ZipEntry zipEntry2 = new ZipEntry(file.getName());
                zipOutputStream2.putNextEntry(zipEntry);
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(zipOutputStream2, Charset.forName("UTF-8")));
                printWriter.println("# Resource Canary Result Infomation. THIS FILE IS IMPORTANT FOR THE ANALYZER !!");
                printWriter.println("sdkVersion=" + Build.VERSION.SDK_INT);
                printWriter.println("manufacturer=" + ((C80530h) C91441c.m114730d().mo125377a(C80530h.class)).f235548h.f234434d);
                printWriter.println("hprofEntry=" + zipEntry2.getName());
                printWriter.println("leakedActivityKey=" + fVar2.f262652e);
                printWriter.flush();
                zipOutputStream2.closeEntry();
                zipOutputStream2.putNextEntry(zipEntry2);
                C79696c.m96815b(file, zipOutputStream2);
                zipOutputStream2.closeEntry();
                file.delete();
                file3.delete();
                C118672d.m167353c("Matrix.CanaryWorkerService", "process hprof file use total time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                try {
                    CanaryResultService.m98094f(this, file2.getAbsolutePath(), fVar2.f262653f);
                    C79696c.m96814a(zipOutputStream2);
                } catch (IOException e) {
                    e = e;
                    zipOutputStream = zipOutputStream2;
                    try {
                        C118672d.m167354d("Matrix.CanaryWorkerService", e, "", new Object[0]);
                        C79696c.m96814a(zipOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        C79696c.m96814a(zipOutputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    zipOutputStream = zipOutputStream2;
                    C79696c.m96814a(zipOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                zipOutputStream = zipOutputStream2;
                C118672d.m167354d("Matrix.CanaryWorkerService", e, "", new Object[0]);
                C79696c.m96814a(zipOutputStream);
            } catch (Throwable th5) {
                th = th5;
                zipOutputStream = zipOutputStream2;
                C79696c.m96814a(zipOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            C118672d.m167354d("Matrix.CanaryWorkerService", e, "", new Object[0]);
            C79696c.m96814a(zipOutputStream);
        } catch (Throwable th6) {
            th = th6;
            C79696c.m96814a(zipOutputStream);
            throw th;
        }
    }
}
