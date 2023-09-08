package p172io.flutter.embedding.engine.plugins.service;

/* renamed from: io.flutter.embedding.engine.plugins.service.ServiceAware */
public interface ServiceAware {

    /* renamed from: io.flutter.embedding.engine.plugins.service.ServiceAware$OnModeChangeListener */
    public interface OnModeChangeListener {
        void onMoveToBackground();

        void onMoveToForeground();
    }

    void onAttachedToService(ServicePluginBinding servicePluginBinding);

    void onDetachedFromService();
}
