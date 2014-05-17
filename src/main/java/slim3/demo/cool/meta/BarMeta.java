package slim3.demo.cool.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-07-16 10:53:31")
/** */
public final class BarMeta extends org.slim3.datastore.ModelMeta<slim3.demo.cool.model.Bar> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<slim3.demo.cool.model.Bar, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<slim3.demo.cool.model.Bar, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<slim3.demo.cool.model.Bar> sortValue = new org.slim3.datastore.StringAttributeMeta<slim3.demo.cool.model.Bar>(this, "sortValue", "sortValue");

    private static final BarMeta slim3_singleton = new BarMeta();

    /**
     * @return the singleton
     */
    public static BarMeta get() {
       return slim3_singleton;
    }

    /** */
    public BarMeta() {
        super("Bar", slim3.demo.cool.model.Bar.class);
    }

    @Override
    public slim3.demo.cool.model.Bar entityToModel(com.google.appengine.api.datastore.Entity entity) {
        slim3.demo.cool.model.Bar model = new slim3.demo.cool.model.Bar();
        model.setKey(entity.getKey());
        model.setSortValue((java.lang.String) entity.getProperty("sortValue"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        slim3.demo.cool.model.Bar m = (slim3.demo.cool.model.Bar) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("sortValue", m.getSortValue());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        slim3.demo.cool.model.Bar m = (slim3.demo.cool.model.Bar) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        slim3.demo.cool.model.Bar m = (slim3.demo.cool.model.Bar) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(slim3.demo.cool.model.Bar) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        slim3.demo.cool.model.Bar m = (slim3.demo.cool.model.Bar) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getSortValue() != null){
            writer.setNextPropertyName("sortValue");
            encoder0.encode(writer, m.getSortValue());
        }
        writer.endObject();
    }

    @Override
    protected slim3.demo.cool.model.Bar jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        slim3.demo.cool.model.Bar m = new slim3.demo.cool.model.Bar();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("sortValue");
        m.setSortValue(decoder0.decode(reader, m.getSortValue()));
        return m;
    }
}