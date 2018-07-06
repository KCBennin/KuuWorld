package java.kuuWorld.Repository;

public interface IReadOnlyRepository<T>{

    public T GetEntity(int Id);

    public List<T> GetAllResources();
}