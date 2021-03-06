package kuuWorld.Repository.Interfaces;

import java.util.List;

public interface IReadOnlyRepository<T>{

    public T GetEntity(int Id);

    /**
     *
     * @return
     */
    public List<T> GetAllResources();
}